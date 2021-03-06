package pl.sda.springsecurity2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.springsecurity2.model.RoleEntity;
import pl.sda.springsecurity2.model.RoleType;
import pl.sda.springsecurity2.repository.RoleRepository;

@SpringBootApplication
public class SpringSecurity2Application implements ApplicationRunner {

    @Autowired
    private RoleRepository roleRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurity2Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        if (roleRepository.findAll().isEmpty()) {
            createRole(RoleType.ROLE_USER);
            createRole(RoleType.ROLE_ADMIN);
        }
    }

    private void createRole(RoleType roleType) {
        RoleEntity roleUser = RoleEntity.builder().name(roleType).build();
        roleRepository.save(roleUser);
    }
}
