package com.seymour.cars.car;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CarService {
    public List<Car> getCar() {
        return List.of(new Car(
                1L,
                "Mercedes‑Benz",
                "A-Class",
                2022
        ),
        new Car(
                2L,
                "Audi",
                "A3",
                2023
        ),
                new Car(
                        3L,
                        "Audi",
                        "A4",
                        2023
                ),
                new Car(
                        4L,
                        "Audi",
                        "A4 allroad",
                        2023
                ),
                new Car(
                        5L,
                        "Audi",
                        "A5",
                        2022
                ),
                new Car(
                        6L,
                        "Audi",
                        "A6",
                        2022
                ),
                new Car(
                        7L,
                        "GMC",
                        "Acadia",
                        2023
                ),
                new Car(
                        8L,
                        "Hyundai",
                        "Accent",
                        2021
                ),
                new Car(
                        9L,
                        "Honda",
                        "Accord",
                        2022
                ),
                new Car(
                        10L,
                        "Lucid",
                        "Air",
                        2022
                ),
                new Car(
                        12L,
                        "Nissan",
                        "Altima",
                        2020
                ),
                new Car(
                        13L,
                        "Nissan",
                        "Ariya",
                        2023
                ));
    }
}
