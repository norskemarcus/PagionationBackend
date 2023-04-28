package dat3.paginationserver.service;

import dat3.paginationserver.dto.CarResponse;
import dat3.paginationserver.repository.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

@Service
public class CarService {

  private final CarRepository carRepository;

  public CarService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public Page<CarResponse> fetchAllCars(Pageable pageable) {
    Page<CarResponse> cars = carRepository.findAll(pageable).map(car -> new CarResponse(car));
    return cars;
  }

  public Page<CarResponse> fetchAllCarsByBrand(Pageable pageable, String brand) {
    Page<CarResponse> carsByBrand = carRepository.findAllByBrand(pageable, brand).map(car -> new CarResponse(car));
    return carsByBrand;
}

  }



