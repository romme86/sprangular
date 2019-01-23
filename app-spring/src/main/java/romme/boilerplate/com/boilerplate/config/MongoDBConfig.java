package romme.boilerplate.com.boilerplate.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import romme.boilerplate.com.boilerplate.document.User;
import romme.boilerplate.com.boilerplate.repository.UserRepository;

@EnableMongoRepositories(basePackages = "romme.boilerplate.com.boilerplate.repository")
@Configuration
public class MongoDBConfig {

//    private static final Logger log = LoggerFactory.getLogger(BoilerplateApplication.class);
    @Bean
    public CommandLineRunner commandLineRunner(UserRepository repository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // save a couple of customers
                repository.save(new User("Jack", "Bauer", 1));
                repository.save(new User("Chloe", "O'Brian", 1));
                repository.save(new User("Kim", "Bauer", 1));
                repository.save(new User("David", "Palmer", 1));
                repository.save(new User("Michelle", "Dessler", 1));
//
//                // fetch all Users
//                log.info("Users found with findAll():");
//                log.info("-------------------------------");
//                for (User User : repository.findAll()) {
//                    log.info(User.toString());
//                }
//                log.info("");
//
//                // fetch an individual User by ID
//                repository.findById(1L)
//                        .ifPresent(User -> {
//                            log.info("User found with findById(1L):");
//                            log.info("--------------------------------");
//                            log.info(User.toString());
//                            log.info("");
//                        });
//
//                // fetch Users by last name
//                log.info("User found with findByLastName('Bauer'):");
//                log.info("--------------------------------------------");
////                repository.findByName("Bauer").forEach(bauer -> {
////                    log.info(bauer.toString());
////                });
//                // for (User bauer : repository.findByLastName("Bauer")) {
//                // 	log.info(bauer.toString());
//                // }
//                log.info("");
            }
        };
    }
}
