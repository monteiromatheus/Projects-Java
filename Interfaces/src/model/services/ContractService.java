/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import java.util.Calendar;
import java.util.Date;
import model.entities.Contract;
import model.entities.Installments;

/**
 *
 * @author Matheus
 */
public class ContractService {

    private OnlinePaymentService onlinePayment;

    public ContractService() {

    }

    public ContractService(OnlinePaymentService onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = basicQuota + onlinePayment.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePayment.paymentFee(updatedQuota);
            contract.addInstallment(new Installments(date, fullQuota));
        }
    }

    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,n);
        return cal.getTime();
    }

}
