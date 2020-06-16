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
public class UsaInterestService implements InterestService{
    
    private Double interestRate;
    
    public UsaInterestService(){
        
    }

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
    
}
