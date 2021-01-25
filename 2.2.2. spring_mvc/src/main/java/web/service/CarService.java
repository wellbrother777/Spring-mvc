package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private Car car;

    @Transactional
    public List<Car> carsList(int num) {
        return car.getCars().subList(0, num);
    }

}
