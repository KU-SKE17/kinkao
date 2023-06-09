package ku.kinkao.model;

import ku.kinkao.config.AttributeEncryptor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue
    private UUID id;

    @Convert(converter = AttributeEncryptor.class)
    private String username;
    private String password;
    @Convert(converter = AttributeEncryptor.class)
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private Instant createdAt;

    // .... generate getter/setter for all attributes

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
