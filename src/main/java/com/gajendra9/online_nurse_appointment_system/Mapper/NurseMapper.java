package com.gajendra9.online_nurse_appointment_system.Mapper;

import com.gajendra9.online_nurse_appointment_system.DTO.NurseDTO;
import com.gajendra9.online_nurse_appointment_system.DTO.NurseRegistrationDTO;
import com.gajendra9.online_nurse_appointment_system.Entity.Credential;
import com.gajendra9.online_nurse_appointment_system.Entity.Nurse;

public class NurseMapper {
    
    public static Nurse mapToNurse(NurseRegistrationDTO nurseRegistrationDTO) {
        
        return new Nurse(nurseRegistrationDTO.getNurseID(), nurseRegistrationDTO.getNurseUsername(), nurseRegistrationDTO.getNurseName(), nurseRegistrationDTO.getNurseAddress(), nurseRegistrationDTO.getNurseContact());
        
    }
    
    public static Credential mapToNurseCredential(NurseRegistrationDTO nurseRegistrationDTO) {
        
        return new Credential(nurseRegistrationDTO.getNurseUsername(), nurseRegistrationDTO.getNursePassword(), "NURSE");
        
    }
    
    public static NurseRegistrationDTO mapToNurseRegistrationDTO(Nurse nurse, Credential nurseCredential) {
        
        return new NurseRegistrationDTO(nurse.getNurseID(), nurseCredential.getEntityUsername(), nurseCredential.getEntityPassword(), nurse.getNurseName(), nurse.getNurseAddress(), nurse.getNurseContact());
        
    }
    
    public static Nurse mapToNurse(NurseDTO nurseDTO, String nurseUsername) {
        
        return new Nurse(nurseDTO.getNurseID(), nurseUsername, nurseDTO.getNurseName(), nurseDTO.getNurseAddress(), nurseDTO.getNurseContact());
        
    }
    
    public static NurseDTO mapToNurseDTO(Nurse nurse) {
        
        return new NurseDTO(nurse.getNurseID(), nurse.getNurseName(), nurse.getNurseAddress(), nurse.getNurseContact());
        
    }
    
}