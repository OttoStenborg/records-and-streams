package se.sprinto.hakan;

import se.sprinto.hakan.model.Computer;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Computer computer = new Computer("Macbook", 100);
        Computer pc = new Computer("PC", 10);

        List<Computer> computerList = List.of(computer, pc);

        WebShopService webShopService = new WebShopService();

//        Optional<Computer> mostExpensive =
//                webShopService.findMostExpensiveComputer(computerList);
//
//        if (mostExpensive.isPresent()) {
//            IO.println(mostExpensive.get());
//        }

        IO.println(webShopService.findMostExpensiveComputer(computerList));

//        System.out.printf("Dator med title %s och pris: %s",
//                computer.title(), computer.price());
    }
}
