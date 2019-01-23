package romme.boilerplate.com.boilerplate.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import romme.boilerplate.com.boilerplate.document.User;
import romme.boilerplate.com.boilerplate.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/rest/user/")
public class UserResource {

    private UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userRepository.findAll();

    }
}
