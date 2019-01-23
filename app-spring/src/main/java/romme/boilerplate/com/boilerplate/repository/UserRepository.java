package romme.boilerplate.com.boilerplate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import romme.boilerplate.com.boilerplate.document.User;

import java.util.List;

public interface UserRepository extends MongoRepository<User, Long> {
//    List<User> findByName(String name);
}
