package main;

import model.Car;
import model.Customer;
import rental.Rental;

public class Main {
    public static void main(String[] args) {
        //Test Object
        Car car1 = new Car("C001", "Mercedes Benz", 2007, 65.5);
        Customer customer1 = new Customer("U001", "Lazarel Goga", "lazarel.goga24@umt.edu.al");
        Rental rental1 = new Rental(customer1, car1, 2);

        System.out.println("<== Rental Summary ==>");
        System.out.println("Customer: " + rental1.getCustomer().getName());
        System.out.println("Car: " + rental1.getCar().getModel());
        System.out.println("Days rented: " + rental1.getDays());
    }
}
