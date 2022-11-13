package de.heilmann.springboot.angular.template.application;

import de.heilmann.springboot.angular.template.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
