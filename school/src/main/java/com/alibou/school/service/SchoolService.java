package com.alibou.school.service;

import com.alibou.school.client.StudentClient;
import com.alibou.school.dto.FullSchoolResponse;
import com.alibou.school.entity.School;
import com.alibou.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    private final StudentClient client;

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

    // todo : find all students from the student microservice
    public FullSchoolResponse findStudentsWithSchoolId(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(School.builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build());

        // todo : using @FeignClient
        var students = client.findAllStudentsBySchool(schoolId);
       return FullSchoolResponse.builder()
               .name(school.getName())
               .email(school.getEmail())
               .students(students)
               .build();
    }
}
