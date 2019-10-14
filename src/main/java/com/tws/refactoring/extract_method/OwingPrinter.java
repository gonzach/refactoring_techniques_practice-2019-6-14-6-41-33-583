package com.tws.refactoring.extract_method;

import java.util.Iterator;
import java.util.List;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {

        String banner = "*****************************\r\n****** Customer totals ******\r\n*****************************";

        Double totalPrice = orders.stream().map(Order::getAmount).reduce(Double::sum).orElse(0.0);

        System.out.println(banner);
        System.out.println("name: " + name);
        System.out.println("amount: " + totalPrice);
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
