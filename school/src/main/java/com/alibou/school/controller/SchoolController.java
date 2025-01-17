package com.alibou.school.controller;

import com.alibou.school.dto.FullSchoolResponse;
import com.alibou.school.entity.School;
import com.alibou.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping("/schools")
    @ResponseStatus(HttpStatus.CREATED)
    public School saveSchool(@RequestBody School school) {
        return schoolService.saveSchool(school);
    }

    @GetMapping("/schools")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<School> findAllSchools() {
        return schoolService.findAllSchool();
    }

    @GetMapping("/schools/{school-id}")
    @ResponseStatus(HttpStatus.FOUND)
    public School findSchool(@PathVariable("school-id") Integer schoolId) {
        return schoolService.findSchool(schoolId);
    }

    @DeleteMapping("/schools/{school-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSchool(@PathVariable("school-id") Integer schoolId) {
        schoolService.deleteSchool(schoolId);
    }

    @GetMapping("/with-students/{school-id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<FullSchoolResponse> findStudentsWithSchoolId(@PathVariable("school-id") Integer schoolId) {
        return ResponseEntity.ok(schoolService.findStudentsWithSchoolId(schoolId));
    }
}
