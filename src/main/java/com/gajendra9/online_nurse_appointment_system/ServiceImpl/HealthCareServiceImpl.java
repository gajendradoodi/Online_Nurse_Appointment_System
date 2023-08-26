package com.gajendra9.online_nurse_appointment_system.ServiceImpl;

import org.springframework.stereotype.Service;

import com.gajendra9.online_nurse_appointment_system.DTO.HealthCareDTO;
import com.gajendra9.online_nurse_appointment_system.Entity.HealthCare;
import com.gajendra9.online_nurse_appointment_system.Exception.ResourceNotFoundException;
import com.gajendra9.online_nurse_appointment_system.Mapper.HealthCareMapper;
import com.gajendra9.online_nurse_appointment_system.Repository.HealthCareRepository;
import com.gajendra9.online_nurse_appointment_system.Service.HealthCareService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HealthCareServiceImpl implements HealthCareService {
    
    @Override
    public HealthCareDTO registerHealthCare(HealthCareDTO healthCareDTO) {
        
        HealthCare healthCare = HealthCareMapper.mapToHealthCare(healthCareDTO);
        
        HealthCare registeredHealthCare = healthCareRepository.save(healthCare);
        
        return HealthCareMapper.mapToHealthCareDTO(registeredHealthCare);
        
    }
    
    @Override
    public HealthCareDTO updateHealthCare(Integer healthCareID, HealthCareDTO healthCareDTO) {
        
        HealthCare healthCare = healthCareRepository.findById(healthCareID).orElseThrow(
            
            () -> new ResourceNotFoundException("healthCareID: " + healthCareID + " | Status: HealthCare not present in database.")
            
        );
        
        healthCare.setHealthCareDescription(healthCareDTO.getHealthCareDescription());
        healthCare.setHealthCareCharge(healthCareDTO.getHealthCareCharge());
        
        HealthCare updatedHealthCare = healthCareRepository.save(healthCare);
        
        return HealthCareMapper.mapToHealthCareDTO(updatedHealthCare);
        
    }
    
    @Override
    public void deleteHealthCare(Integer healthCareID) {
        
        healthCareRepository.findById(healthCareID).orElseThrow(
            
            () -> new ResourceNotFoundException("healthCareID: " + healthCareID + " | Status: HealthCare not present in database.")
            
        );
        
        healthCareRepository.deleteById(healthCareID);
        
    }
    
    private HealthCareRepository healthCareRepository;
    
}