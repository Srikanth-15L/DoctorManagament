package com.example.DoctorExample.Service;

import com.example.DoctorExample.Model.Doctor;
import com.example.DoctorExample.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //it contain business and application logic

public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public String addDoctor(Doctor doctorreq1){
        Doctor doctor = new Doctor();//take doctorreq and add it inside object
       // Doctor doctor = new Doctor();
       // doctor.setDoctorid(doctorreq1.getDoctorid());
        doctor.setEmail(doctorreq1.getEmail());
        doctor.setDoctorName(doctorreq1.getDoctorName());
        doctor.setDoctorSpeciality(doctorreq1.getDoctorSpeciality());
        //save the doctor info
        doctor=doctorRepository.save(doctor);
        return "Doctor saved sucessfully";
    }
    public Doctor findDoctorByid(int doctorId){
      Optional<Doctor> doctoroptional = doctorRepository.findById(doctorId);
      Doctor doctor=doctoroptional.get();
      return doctor;

    }
    public List<Doctor> findalldoctors(){
        List<Doctor> doc=doctorRepository.findAll();
        return doc;
    }

}
