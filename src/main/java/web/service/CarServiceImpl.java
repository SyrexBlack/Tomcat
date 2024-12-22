package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    @PostConstruct
    public void init() {
        carList = new ArrayList<>();
        carList.add(new Car("Ford", "Mustang", 2020));
        carList.add(new Car("Chevrolet", "Camaro", 2019));
        carList.add(new Car("Tesla", "Model 3", 2022));
        carList.add(new Car("BMW", "M3", 2021));
        carList.add(new Car("Audi", "A6", 2018));
        carList.add(new Car("Volkswagen", "Golf", 2017));
        carList.add(new Car("Subaru", "Impreza", 2016));
        carList.add(new Car("Mazda", "MX-5", 2020));
        carList.add(new Car("Hyundai", "Elantra", 2021));
        carList.add(new Car("Nissan", "Skyline", 2022));
        carList.add(new Car("Toyota", "Supra", 2019));
        carList.add(new Car("Honda", "Civic", 2018));
        carList.add(new Car("Mercedes-Benz", "C-Class", 2021));
        carList.add(new Car("Jaguar", "XF", 2020));
        carList.add(new Car("Porsche", "911", 2022));
        carList.add(new Car("Lexus", "RX", 2019));
        carList.add(new Car("Kia", "Sportage", 2021));
        carList.add(new Car("Land Rover", "Discovery", 2020));
        carList.add(new Car("Volvo", "XC60", 2022));
        carList.add(new Car("Mini", "Cooper", 2018));
        carList.add(new Car("Jeep", "Wrangler", 2019));
        carList.add(new Car("Dodge", "Challenger", 2021));
        carList.add(new Car("Alfa Romeo", "Giulia", 2020));
        carList.add(new Car("Ferrari", "Portofino", 2022));
        carList.add(new Car("Lamborghini", "Huracan", 2021));
        carList.add(new Car("Maserati", "Ghibli", 2020));
        carList.add(new Car("Peugeot", "3008", 2019));
        carList.add(new Car("Renault", "Megane", 2018));
        carList.add(new Car("Citroën", "C4", 2021));
        carList.add(new Car("Opel", "Insignia", 2022));
    }

    @Override
    public List<Car> carList(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
