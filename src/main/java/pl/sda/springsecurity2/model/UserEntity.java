package pl.sda.springsecurity2.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id") }
    )
    private List<RoleEntity> roles;
}
