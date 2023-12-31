package com.gajendra9.online_nurse_appointment_system.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AppointmentViewDTO {
    
    private
        
        Integer appointmentID;
        CustomerDTO customerDTO;
        NurseDTO nurseDTO;
        HealthCareDTO healthCareDTO;
        Boolean paymentStatus;
}
