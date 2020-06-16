/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import java.security.InvalidParameterException;

/**
 *
 * @author Matheus
 */
public interface InterestService {

    Double getInterestRate();

    default double payment(double amount, int months) {

        if (months < 1) {

            throw new InvalidParameterException("Mês não pode ser negativo");
        }

        return amount * Math.pow(1 + getInterestRate() / 100, months);
    }
}
