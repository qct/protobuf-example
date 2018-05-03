package com.example.protobuf.example;

import com.example.protobuf.example.generated.vo.Hobby;
import com.example.protobuf.example.generated.vo.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTemplateApplication.class, args);
    }


    @Component
    public static class Demo implements ApplicationRunner {

        @Override
        public void run(ApplicationArguments args) throws Exception {
            Hobby hobby = Hobby.newBuilder().setName("swimming").setLevel(1).build();
            User alice = User.newBuilder().setFirstName("alice").build();
            System.out.println(hobby);
            System.out.println(alice);
        }
    }
}
