package com.alibou.school.dto;

import com.alibou.school.entity.Student;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {

    private String name;

    private String email;

    private List<Student> students;
}
