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
public interface OnlinePaymentService {
    
    double paymentFee(Double amount);
    double interest(Double amount, Integer months);

}