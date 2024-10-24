package fr.ldtb.studio.apidemodevops;

import org.springframework.boot.SpringApplication;

public class TestApiDemoDevopsApplication {

    public static void main(String[] args) {
        SpringApplication.from(ApiDemoDevopsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
