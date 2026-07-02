package collections.set;

import java.util.HashSet;
import java.util.Set;

public class UserRegistry {

    private Set<User> users = new HashSet<>(); // SET #1 - Users

    public void addToRegistry(User user) { // Check if email already exists
        if(blacklist.contains(user.getEmail())) {
            System.out.println("ERROR! This email "+ user.getEmail() + " is in the black list. Sorry!");
        } else {
            boolean added = users.add(user);
            if(added) {
                System.out.println("Registered: " + user);
            } else {
                System.out.println("New account wasn't created! Email already exists: " + user.getEmail());
            }
        }
    }

    public void printAllUsers() {
        for(User user : users) {
            System.out.println(user);
        }
    }

    private Set<String> blacklist = new HashSet<>(); // SET #2 - Blacklist

    public void addToBlacklist(String email) {
        blacklist.add(email);
    }

    public void deleteUser(String email) {
        boolean removed = users.removeIf(user -> user.getEmail().equals(email));
        if(removed) {
            System.out.println("Account deleted " + email);
        } else {
            System.out.println("No account found with provided email: [" + email + "]." );
        }
    }

    public static void main(String[] args) {

        User user1 = new User("Jenny123", "jenny123@gmail.com");
        User user2 = new User("Jenny345", "jenny345@gmail.com");
        User user3 = new User("Bob Martin", "jenny345@gmail.com");

        UserRegistry registry = new UserRegistry();

        registry.addToRegistry(user1);
        registry.addToRegistry(user2);
        registry.addToRegistry(user3);
        registry.addToBlacklist("spam777@gmail.de");

        User user4 = new User("Henry", "spam777@gmail.de");
        registry.addToRegistry(user4);

        User user5 = new User("AliceInWondeland", "alice@gmail.com");
        registry.addToRegistry(user5);

        registry.deleteUser("jenny123@gmail.com");

        System.out.println();
        System.out.println("-- Total users: --");

        registry.printAllUsers();
    }
}
