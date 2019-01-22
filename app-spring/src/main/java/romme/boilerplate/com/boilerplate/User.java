//package romme.boilerplate.com.boilerplate;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private Integer authLevel;
//
//    public User(String firstName, String lastName, Integer authLevel) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.authLevel = authLevel;
//    }
//
//    @Override
//    public String toString(){
//        return String.format("User[ id=%d, name=%s, surname=%s",this.id,this.firstName,this.lastName);
//    }
//
//
//}
