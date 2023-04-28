package dat3.paginationserver.repository;

import dat3.paginationserver.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

  // JpaRepository extends ListPagingAndSortingRepository

  Page<Car> findAllByBrand(Pageable pageable, String brand);

}