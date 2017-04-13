package es.crowdynamics.cook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by marcos on 13/04/17.
 */
@SpringBootApplication
@ImportResource({"classpath*:META-INF/spring/applicationContext.xml"})
public class RecipesApplication  {

    public static void main(String[] args)  {
        SpringApplication.run(RecipesApplication.class, args);
    }
}
