package com.gajendra9.online_nurse_appointment_system.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Credential")
public class Credential {
    
    @Id
    @Column(name = "entityUsername")
    private String entityUsername;
    
    @Column(name = "entityPassword")
    private String entityPassword;
    
    @Column(name = "entityRole")
    private String entityRole;
    
}