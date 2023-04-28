package dat3.paginationserver.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.paginationserver.entity.Car;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) // ignoring null fields or attribute
public class CarResponse {
  private int id; // primary key
  private String brand;
  private String model;
  private String color;
  private int kilometers;

  public CarResponse(Car car) {
    this.id = car.getId();
    this.brand = car.getBrand();
    this.model = car.getModel();
    this.color = car.getModel();
    this.kilometers = car.getKilometers();
  }
}
