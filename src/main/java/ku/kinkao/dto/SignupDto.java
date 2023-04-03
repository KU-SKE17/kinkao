package ku.kinkao.dto;

import ku.kinkao.validation.ValidPassword;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class SignupDto {
    @NotBlank
    @Size(min = 4, message = "Username must have at least 4 characters")
    private String username;

    @NotBlank
    @ValidPassword
    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name can only contain letters")
    @Size(min = 12, max = 128, message = "Password must have at least 12 characters")
    private String password;

    @Email
    @NotBlank
    private String email;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank
    private String lastName;
}
