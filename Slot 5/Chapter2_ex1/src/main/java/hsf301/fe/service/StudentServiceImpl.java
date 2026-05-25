package hsf301.fe.service;

import hsf301.fe.pojos.Student;

public class StudentServiceImpl implements StudentService{

    @Override
    public void save(Student student) {
        System.out.println("Save Student...");
    }
}
