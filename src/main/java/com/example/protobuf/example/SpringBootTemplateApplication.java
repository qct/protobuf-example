package com.example.protobuf.example;

import com.example.protobuf.example.generated.vo.Hobby;
import com.example.protobuf.example.generated.vo.HobbyOrBuilder;
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
            Hobby build = Hobby.newBuilder().setLevel(1).build();
            System.out.println(build);
        }
    }
}
