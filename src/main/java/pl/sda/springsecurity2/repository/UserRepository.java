package pl.sda.springsecurity2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.springsecurity2.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
