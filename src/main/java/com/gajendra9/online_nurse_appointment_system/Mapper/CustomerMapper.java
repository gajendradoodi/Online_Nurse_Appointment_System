package com.gajendra9.online_nurse_appointment_system.Mapper;

import com.gajendra9.online_nurse_appointment_system.DTO.CustomerDTO;
import com.gajendra9.online_nurse_appointment_system.DTO.CustomerRegistrationDTO;
import com.gajendra9.online_nurse_appointment_system.Entity.Credential;
import com.gajendra9.online_nurse_appointment_system.Entity.Customer;

public class CustomerMapper {
    
    public static Customer mapToCustomer(CustomerRegistrationDTO customerRegistrationDTO) {
        
        return new Customer(customerRegistrationDTO.getCustomerID(), customerRegistrationDTO.getCustomerUsername(), customerRegistrationDTO.getCustomerName(), customerRegistrationDTO.getCustomerAddress(), customerRegistrationDTO.getCustomerContact());
        
    }
    
    public static Credential mapToCustomerCredential(CustomerRegistrationDTO customerRegistrationDTO) {
        
        return new Credential(customerRegistrationDTO.getCustomerUsername(), customerRegistrationDTO.getCustomerPassword(), "CUSTOMER");
        
    }
    
    public static CustomerRegistrationDTO mapToCustomerRegistrationDTO(Customer customer, Credential customerCredential) {
        
        return new CustomerRegistrationDTO(customer.getCustomerID(), customerCredential.getEntityUsername(), customerCredential.getEntityPassword(), customer.getCustomerName(), customer.getCustomerAddress(), customer.getCustomerContact());
        
    }
    
    public static Customer mapToCustomer(CustomerDTO customerDTO, String customerUsername) {
        
        return new Customer(customerDTO.getCustomerID(), customerUsername, customerDTO.getCustomerName(), customerDTO.getCustomerAddress(), customerDTO.getCustomerContact());
        
    }
    
    public static CustomerDTO mapToCustomerDTO(Customer customer) {
        
        return new CustomerDTO(customer.getCustomerID(), customer.getCustomerName(), customer.getCustomerAddress(), customer.getCustomerContact());
        
    }
    
}