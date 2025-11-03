package main;

import model.Car;
import model.Customer;
import rental.Rental;

public class Main {
    public static void main(String[] args) {
        // Create some objects to test
        Car car1 = new Car("C001", "Toyota Corolla", 2020, 55.0);
        Customer customer1 = new Customer("U001", "John Doe", "johndoe@email.com");
        Rental rental1 = new Rental(customer1, car1, 5);

        System.out.println("=== Rental Summary ===");
        System.out.println("Customer: " + rental1.getCustomer().getName());
        System.out.println("Car: " + rental1.getCar().getModel());
        System.out.println("Days rented: " + rental1.getDays());
    }
}
