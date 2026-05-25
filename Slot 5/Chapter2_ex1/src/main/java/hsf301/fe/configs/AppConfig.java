package hsf301.fe.configs;

import hsf301.fe.aspects.LoggingAspect;
import hsf301.fe.service.StudentService;
import hsf301.fe.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public StudentService myService(){
        return new StudentServiceImpl();
    }

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
