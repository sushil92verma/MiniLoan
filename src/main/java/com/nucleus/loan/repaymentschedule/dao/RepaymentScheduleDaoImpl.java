package com.nucleus.loan.repaymentschedule.dao;

import com.nucleus.loan.repaymentschedule.model.RepaymentSchedule;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepaymentScheduleDaoImpl implements RepaymentScheduleDaoI
{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addRepaymentSchedule(List<RepaymentSchedule> repaymentSchedules)
    {
        Session session = sessionFactory.getCurrentSession();
        for (RepaymentSchedule repaymentSchedule : repaymentSchedules)
        {
            session.save(repaymentSchedule);
        }
    }

    @Override
    public List<RepaymentSchedule> getRepaymentSchedule(String loanApplicationNo)
    {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM RepaymentSchedule WHERE loan_application_number = " + loanApplicationNo;

        return session.createQuery(hql).list();
    }
}
