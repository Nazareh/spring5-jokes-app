package turmina.nazareh.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import turmina.nazareh.jokeapp.services.ChuckNorrisRandomJoke;

@SpringBootApplication
public class JokeappApplication {


    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }
}
