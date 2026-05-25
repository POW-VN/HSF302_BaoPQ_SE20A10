package hsf301.fe.gui;

import hsf301.fe.configs.AppConfig;
import hsf301.fe.pojos.Student;
import hsf301.fe.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ManyToOne {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService myService = context.getBean(StudentService.class);
        Student st = new Student("Bao", "Pham", 0);
        myService.save(st);
    }
}
