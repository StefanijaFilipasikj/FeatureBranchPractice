package mk.ukim.finki.historicLandmarks.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "App_Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String surname;

    public User(String username, String password, String name, String surname) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public User() {
    }
}