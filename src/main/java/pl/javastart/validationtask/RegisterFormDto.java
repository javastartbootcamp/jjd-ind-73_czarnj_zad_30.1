package pl.javastart.validationtask;

import jakarta.validation.constraints.*;

public class RegisterFormDto {

    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String firstName;
    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String surname;
    @NotNull
    @NotEmpty
    private String address;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "[0-9][0-9]-[0-9][0-9][0-9]", message = "Wpisz poprawny kod pocztowy")
    private String postalCode;
    @NotNull
    @NotEmpty
    private String city;
    @NotNull
    @NotEmpty
    @Email(regexp = ".+@.+\\..+", message = "Adres email musi być poprawnie sformatowany")
    private String email;
    @NotNull
    @NotEmpty
    @Size(min = 8, message = "Hasło musi mieć conajmniej 8 znaków")
    @HardPassword(message = "Hasło musi zawierać minimum 1 duży znak, 1 mały oraz 1 znak specjalny")
    private String password;
    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean termsAgreement;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTermsAgreement() {
        return termsAgreement;
    }

    public void setTermsAgreement(boolean termsAgreement) {
        this.termsAgreement = termsAgreement;
    }
}
