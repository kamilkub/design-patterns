package pl.designs.behavioral.interpreter;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {


    private List<String> permissions;

    private String username;

    public User(String username, String ...permissions) {
        this.permissions = Stream.of(permissions).map(String::toLowerCase).collect(Collectors.toList());
        this.username = username;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUsername() {
        return username;
    }
}
