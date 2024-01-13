package com.hilmi.StudentManagementSystem.bootstrap;

import com.hilmi.StudentManagementSystem.entity.Student;
import com.hilmi.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootstrapData implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student("Hilmi", "Başkoparan", "h.baskoparan@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Jonathan", "Wick", "wick@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("James", "JJJ", "jjj@gmail.com");
        studentRepository.save(student3);
    }
}
