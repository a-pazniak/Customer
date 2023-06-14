package pl.aleh.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.aleh.customer.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
