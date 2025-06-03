//This example demonstrates an implementation of the Single Responsibility Principle (SRP) in Java.

// The class `User` has a single responsibility: managing user data.
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}


