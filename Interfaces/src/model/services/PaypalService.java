/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

/**
 *
 * @author Matheus
 */
public class PaypalService implements OnlinePaymentService {

    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public double paymentFee(Double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public double interest(Double amount, Integer months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
