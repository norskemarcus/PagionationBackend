package dat3.paginationserver.api;


import dat3.paginationserver.dto.CarResponse;
import dat3.paginationserver.entity.Car;
import dat3.paginationserver.repository.CarRepository;
import dat3.paginationserver.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@CrossOrigin
public class CarController {

 private CarService carService;

 public CarController(CarService carService) {
  this.carService = carService;
 }

 @GetMapping()
 public List<CarResponse> getCars(Pageable pageable) {
  Page<CarResponse> carPage = carService.fetchAllCars(pageable);
  return carPage.getContent();
 }

 // /api/car/brand/volvo?page=1&size=3&sort=brand,asc
 @GetMapping("/brand/{brand}")
 public List<CarResponse> getCarsSortByBrand(@PathVariable String brand, Pageable pageable) {
  Page<CarResponse> carPage = carService.fetchAllCarsByBrand(pageable, brand);
  return carPage.getContent();
 }

 @GetMapping("/amount")
 public long getTotalAmountOfCars(Pageable pageable){
  return carService.fetchAllCars(pageable).getTotalElements();
 }
}
