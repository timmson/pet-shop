package ru.petshop.promo.task3;

public class ChequeService {

    public boolean createCheque(ChequeData chequeData) {
        return saveChequeData(chequeData) & addBonusesToCustomerAccount(chequeData) & sendChequeToGov(chequeData);
    }

    private boolean sendChequeToGov(ChequeData chequeData) {
        try {
            /*
             * ...
             * Call 3rd party service
             * ...
             */
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean addBonusesToCustomerAccount(ChequeData chequeData) {
        try {
            /*
             * ...
             * Call 3rd party service
             * ...
             */
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean saveChequeData(ChequeData chequeData) {
        try {
            /*
             * ...
             * Call 3rd party service
             * ...
             */
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

}
