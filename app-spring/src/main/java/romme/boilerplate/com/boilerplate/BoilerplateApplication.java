package romme.boilerplate.com.boilerplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class BoilerplateApplication {


    private static final Logger log = LoggerFactory.getLogger(BoilerplateApplication.class);
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


//    @Bean
//    public CommandLineRunner demo(UserRepository repository){
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new User("Jack", "Bauer", 1));
//            repository.save(new User("Chloe", "O'Brian", 1));
//            repository.save(new User("Kim", "Bauer", 1));
//            repository.save(new User("David", "Palmer", 1));
//            repository.save(new User("Michelle", "Dessler", 1));
//
//            // fetch all Users
//            log.info("Users found with findAll():");
//            log.info("-------------------------------");
//            for (User User : repository.findAll()) {
//                log.info(User.toString());
//            }
//            log.info("");
//
//            // fetch an individual User by ID
//            repository.findById(1L)
//                    .ifPresent(User -> {
//                        log.info("User found with findById(1L):");
//                        log.info("--------------------------------");
//                        log.info(User.toString());
//                        log.info("");
//                    });
//
//            // fetch Users by last name
//            log.info("User found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            repository.findByName("Bauer").forEach(bauer -> {
//                log.info(bauer.toString());
//            });
//            // for (User bauer : repository.findByLastName("Bauer")) {
//            // 	log.info(bauer.toString());
//            // }
//            log.info("");
//        };
//    }
}

