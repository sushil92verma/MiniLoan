package com.nucleus.loan.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EligibilityPolicyDaoImpl implements EligibilityPolicyDao
{
    // need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    

}
