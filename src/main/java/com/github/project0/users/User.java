package com.github.project0.users;

import java.util.Objects;

public class User {
    
    private String id;
    private String username;
    private String givenName;
    private String email;
    private String password;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(givenName, user.givenName) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, givenName, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
        "id='" + id + '\'' +
        ", username='" + username + '\'' +
        ", givenName='" + givenName + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        '}';
    }

}
