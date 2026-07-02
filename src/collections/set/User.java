package collections.set;

import java.util.Objects;

public class User {
    private String username;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String toString() {
        return "[USER: " + username + ", email: " + email + "]";
    }

    public String getName() {
        return username;
    }
    public String getEmail() {
        return email;
    }
}
