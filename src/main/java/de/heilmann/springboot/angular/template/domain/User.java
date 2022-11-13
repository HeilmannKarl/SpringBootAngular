package de.heilmann.springboot.angular.template.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
