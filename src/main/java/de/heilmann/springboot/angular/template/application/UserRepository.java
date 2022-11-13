package de.heilmann.springboot.angular.template.application;

import de.heilmann.springboot.angular.template.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
