package pl.zajecia.dod_2026;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dod2026Application {

    public static void main(String[] args) {
        SpringApplication.run(Dod2026Application.class, args);
    }

    public  int added(int a, int b) {
        return a*b;
    }
}
