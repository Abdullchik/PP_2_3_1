package web.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surName")
    private String surName;

    public User(String name, String sureName) {
        this.name = name;
        this.surName = sureName;
    }

    @Override
    public String toString() {
        return "id " + id + " " + name + " " + surName;
    }
}
