package romme.boilerplate.com.boilerplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import romme.boilerplate.com.boilerplate.document.User;
import romme.boilerplate.com.boilerplate.repository.UserRepository;

@SpringBootApplication
public class BoilerplateApplication {



    public static void main(String[] args) {

        SpringApplication.run(BoilerplateApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "hello from your boilerplate";
    }

    @RequestMapping("/error")
    public String error(){
        return "error page";
    }


}

