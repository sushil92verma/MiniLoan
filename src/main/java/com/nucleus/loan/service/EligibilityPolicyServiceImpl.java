package com.nucleus.loan.service;

import com.nucleus.loan.database.EligibilityPolicyDao;
import com.nucleus.loan.model.EligibilityPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service("eligibilityPolicyService")
public class EligibilityPolicyServiceImpl implements EligibilityPolicyService
{
    // need to inject dao
    @Autowired
    private EligibilityPolicyDao eligibilityPolicyDao;

    @Override
    @Transactional
    public methodName() {
        return ;
    }

    

}
