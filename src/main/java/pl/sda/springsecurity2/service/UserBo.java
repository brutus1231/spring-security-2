package pl.sda.springsecurity2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.springsecurity2.model.RoleEntity;
import pl.sda.springsecurity2.model.RoleType;
import pl.sda.springsecurity2.model.UserEntity;
import pl.sda.springsecurity2.repository.RoleRepository;
import pl.sda.springsecurity2.repository.UserRepository;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class UserBo {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public void create(UserEntity user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        setDefaultRole(user);
        userRepository.save(user);
    }

    private void setDefaultRole(UserEntity user) {
        RoleEntity userRole = roleRepository.findFirstByName(RoleType.ROLE_USER);
        user.setRoles(Arrays.asList(userRole));
    }
}
