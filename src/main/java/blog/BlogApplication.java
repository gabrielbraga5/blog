package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args){
        //crrega os beans- inicia o spring
        SpringApplication.run(BlogApplication.class, args);

    }

}
