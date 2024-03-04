package com.handson.backend.service;

import com.handson.backend.model.Student;
import com.handson.backend.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Iterable<Student> all() {
        return repository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return repository.findById(id);
    }

    public List<Student> getStudentWithSatHigherThan(Integer sat) {
        return repository.findAllBySatScoreGreaterThan(sat);
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public void delete(Student student) {
        repository.delete(student);
    }

}
