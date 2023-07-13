package org.example;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void validateFirstName() {
        if (this.firstName.isBlank())
            throw new RuntimeException("First Name Cannot be null or empty");
    }

    public void validateLastName() {
        if (this.lastName.isBlank())
            throw new RuntimeException("Last Name cannot be null or empty");
    }

    public void validatePhoneNumber() {
        if (this.phoneNumber.isBlank()) {
            throw new RuntimeException("Phone Number cannot be null or empty");
        }

        if (this.phoneNumber.length() != 10) {
            throw new RuntimeException("Phone Number should be 10 Digits Long");
        }
        if (!this.phoneNumber.matches("\\d+")) {
            throw new RuntimeException("Phone Number should contain only digits");
        }
        if (!this.phoneNumber.startsWith("9")) {
            throw new RuntimeException("Phone Number Should Start with 9");
        }
    }
}
