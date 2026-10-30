package se.sprinto.hakan;

import se.sprinto.hakan.model.Computer;

import java.util.List;

public class WebShopService {


    public Computer findMostExpensiveComputer(List<Computer> computerList) {
        Computer computer = computerList.stream()
                .sorted((a, b) -> Double.compare(b.price(), a.price()))
                .findFirst()
                .orElseThrow();//NoSuchElementException kastas här
        return computer;
    }

}
