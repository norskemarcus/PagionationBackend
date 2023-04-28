package dat3.paginationserver.dto;


import dat3.paginationserver.entity.Car;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarRequest {
  private int id;
  private String brand;
  private String model;
  private String color;
  private int kilometers;

  // Car to CarRequest conversion
  public CarRequest(Car car) {
    this.brand = car.getBrand();
    this.model = car.getModel();
    this.color = car.getColor();
    this.kilometers = car.getKilometers();
  }

}
