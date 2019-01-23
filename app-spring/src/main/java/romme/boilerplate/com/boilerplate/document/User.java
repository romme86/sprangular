package romme.boilerplate.com.boilerplate.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer authLevel;

    public User(String firstName, String lastName, Integer authLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.authLevel = authLevel;
    }

    @Override
    public String toString(){
        return String.format("User[ id=%d, name=%s, surname=%s",this.id,this.firstName,this.lastName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(Integer authLevel) {
        this.authLevel = authLevel;
    }
}
