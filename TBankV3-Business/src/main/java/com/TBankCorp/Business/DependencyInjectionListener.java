package com.TBankCorp.Business;

import com.TBankCorp.Business.contract.ManagerFactory;
import com.TBankCorp.Business.impl.ManagerFactoryImpl;
import com.TBankCorp.Business.impl.manager.ICDManagerImpl;
import com.TBankCorp.Consumer.repository.ICDRepository;

import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {

//    private ICDRepository icdRepository;
//
//    public void contextInitialized(ServletContextListener pServletContextListener){
//        ManagerFactory vManagerFactory = new ManagerFactoryImpl();
//
//        vManagerFactory.setICDManager(new ICDManagerImpl(icdRepository));
//    }
}
