package com.gajendra9.online_nurse_appointment_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gajendra9.online_nurse_appointment_system.Entity.Credential;

public interface CredentialRepository extends JpaRepository<Credential, String> {
    
    Credential findByEntityUsername(String entityUsername);
    
}