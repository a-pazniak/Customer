package pl.aleh.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.aleh.customer.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);

}
