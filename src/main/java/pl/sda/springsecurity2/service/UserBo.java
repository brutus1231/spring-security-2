package pl.sda.springsecurity2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.springsecurity2.model.UserEntity;
import pl.sda.springsecurity2.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserBo {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void create(UserEntity user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
    }
}
