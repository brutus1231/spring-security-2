package pl.sda.springsecurity2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.springsecurity2.model.RoleEntity;
import pl.sda.springsecurity2.model.RoleType;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findFirstByName(RoleType name);
}
