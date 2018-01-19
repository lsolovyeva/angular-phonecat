import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"controller","model", "service", "repository"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}