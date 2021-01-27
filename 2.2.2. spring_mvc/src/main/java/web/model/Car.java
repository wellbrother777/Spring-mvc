package web.model;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
private String model;
private int series;
private int year;
private List<Car> carsList;

    public Car() { }

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }

    public List<Car> getCars() {
        carsList = new ArrayList<>();
        carsList.add(new Car("Car1", 1, 2021));
        carsList.add(new Car("Car2", 2, 2022));
        carsList.add(new Car("Car3", 3, 2023));
//        carsList.add(new Car("Car4", 4, 2024));
//        carsList.add(new Car("Car5", 5, 2025));
        return carsList;
    }
}
