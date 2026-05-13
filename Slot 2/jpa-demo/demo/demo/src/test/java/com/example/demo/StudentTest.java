package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentService studentService;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    public void testUpdateStudent(){
        Long id = 2L;
        studentService.updateStudent(id, "Nguyen Van A Update", "a@fpt.edu.update", 22);

        Student updated = entityManager.find(Student.class, id);

        assertNotNull(updated);
        assertEquals("Nguyen Van A Update", updated.getFullName());
        assertEquals("a@fpt.edu.update", updated.getEmail());
        assertEquals(22, updated.getAge());
    }

    @Test
    @Transactional
    public void testDeleteStudent(){
        Long id = 2L;
        studentService.deleteStudent(id);

        Student deleted = entityManager.find(Student.class, id);

        assertNull(deleted,"Student should be deleted from database");
    }
}
