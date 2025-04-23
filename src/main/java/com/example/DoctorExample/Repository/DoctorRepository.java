package com.example.DoctorExample.Repository;

import com.example.DoctorExample.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //it indicates that it perform database operations
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

   // void findByid(int doctorid);
}
