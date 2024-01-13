package com.hilmi.StudentManagementSystem.repository;

import com.hilmi.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
