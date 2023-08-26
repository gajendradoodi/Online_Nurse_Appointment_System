package com.gajendra9.online_nurse_appointment_system.Service;


import java.util.List;

import com.gajendra9.online_nurse_appointment_system.DTO.AppointmentDTO;
import com.gajendra9.online_nurse_appointment_system.DTO.AppointmentViewDTO;

public interface AppointmentService {
    
    
    List<AppointmentViewDTO> viewAppointmentsOfCustomer(Integer customerID);
    
    List<AppointmentViewDTO> viewAppointmentsOfNurse(Integer nurseID);
    
    List<AppointmentViewDTO> viewAppointmentsOfHealthCare(Integer healthCareID);
    
    AppointmentDTO bookAppointment(AppointmentDTO appointmentDTO);
    
    AppointmentDTO updateAppointment(Integer appointmentID, AppointmentDTO appointmentDTO);
    
    void deleteAppointment(Integer appointmentID);
    
    void payForAppointment(Integer appointmentID);
    
}
