/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cabletv.app.serviceaccess;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.PropertySource;
import com.cabletv.app.service.api.*;
import com.cabletv.service.wrappers.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kumaran
 */
@Component("cableTvServiceAccess")
@PropertySource("classpath:/config/serviceaccess/common_serviceaccess.properties")
public class CableTvServiceAccess {
    
    @Value("${hostportname}")
    private String hostportname;
    
    @Value("${endpoint}")
    private String endpoint;
    
    @Autowired
    private CustomerService customerService;
    
    public void getAllCust() {
        
        try {
            
        CustomerServiceResponseList allCustomerList = customerService.getAllCustomers();
        
                
                } catch(Exception e) {
                    
                    e.printStackTrace();
                }
    }
    
    
    
}
