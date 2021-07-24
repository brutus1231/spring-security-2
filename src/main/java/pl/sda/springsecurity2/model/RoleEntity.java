package pl.sda.springsecurity2.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;
}
