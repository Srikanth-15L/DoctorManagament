package com.example.DoctorExample.Controller;

import com.example.DoctorExample.Model.Doctor;
import com.example.DoctorExample.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor/api")
public class DoctorCollector {
    //@RestController
    @Autowired DoctorService doctorser;
    //DoctorService ds  = new DoctorService();

    @PostMapping("/save")//SAVING PURPOSE OF DATA
    public String saveDoctor(@RequestBody Doctor doctorreq1){
        //passes the request to service class
        //DoctorService ds  = new DoctorService();

        //creating the object

               String response=doctorser.addDoctor(doctorreq1);
               //return "doctor saved suceesfully";
           return response;
    }
    @GetMapping("/doctorid/{doctorid}")
    public Doctor findDoctorById(@PathVariable("doctorid") int doctorId){
                     Doctor docl =doctorser.findDoctorByid(doctorId);
                     return docl;

     }
     @GetMapping("/findall")
    public List<Doctor> findalll(){
        List<Doctor> sri =doctorser.findalldoctors();
        return sri;
     }



}
