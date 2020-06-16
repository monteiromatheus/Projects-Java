/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.services.InterestService;

/**
 *
 * @author Matheus
 */
public class BrazilInterestService implements InterestService{
    
    private Double interestRate;
    
    public BrazilInterestService(){
        
    }

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
    
}
