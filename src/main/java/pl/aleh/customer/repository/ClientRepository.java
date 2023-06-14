package pl.aleh.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.aleh.customer.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
