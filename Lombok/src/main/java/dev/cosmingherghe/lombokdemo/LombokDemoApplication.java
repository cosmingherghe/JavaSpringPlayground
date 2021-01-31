package dev.cosmingherghe.lombokdemo;

import dev.cosmingherghe.lombokdemo.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j   // will instantiate log object, so we uncommented the line below
@SpringBootApplication
public class LombokDemoApplication {

    //private static final Logger log = LoggerFactory.getLogger(LombokDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LombokDemoApplication.class, args);

        Student student1 = new Student();
        student1.setFirstName("John");
        student1.setLastName("Doe");
        student1.setId(2L);
        student1.setIndexNumber(999);

        //using @Slf4j log object created
        log.info("Student 1: {}", student1);

        Student student2 = Student.builder()
                .id(3L)
                .indexNumber(1000)
                .firstName("Tom")
                .lastName("Smith")
                .build();

        log.info("Student 2: {}", student2);
    }
}
