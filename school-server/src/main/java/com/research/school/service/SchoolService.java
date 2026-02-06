package com.research.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.school.model.School;
import com.research.school.repository.SchoolRepository;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School addSchool(School school){
        return schoolRepository.save(school);
    }
    public List<School> fetchSchools(){
        return schoolRepository.findAll();
    }
    public School fetchSchoolById(int id){
        return schoolRepository.findById(id).orElse(null);
    }
}