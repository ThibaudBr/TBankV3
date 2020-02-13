package com.TBankCorp.Webapp.controller;

import com.TBankCorp.Business.contract.ManagerFactory;

abstract class AbstractController {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
