package com.alibou.school.service;

import com.alibou.school.entity.School;
import com.alibou.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

    public School findSchool(Integer schoolId) {
        return schoolRepository.findById(schoolId).orElse(null);
    }

    public List<School> findAllSchool() {
        return schoolRepository.findAll();
    }

    public void deleteSchool(Integer schoolId) {
        schoolRepository.deleteById(schoolId);
    }
}
