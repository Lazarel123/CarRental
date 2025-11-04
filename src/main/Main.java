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
        
        Car car2 = new Car("C002", "Tesla", 2025, 300.0);
        Customer customer2 = new Customer("U002", "Elon Musk", "Elon.musk@Tesla.com");
        Rental rental2 = new Rental(customer2, car2, 7);

        System.out.println("<== Rental Summary ==>");
        System.out.println("Customer: " + rental1.getCustomer().getName());
        System.out.println("Car: " + rental1.getCar().getModel());
        System.out.println("Days-Rented: " + rental1.getDays());
        
        System.out.println("\n<== Rental Summary  ==>");
        System.out.println("Customer: " + rental2.getCustomer().getName());
        System.out.println("Car: " + rental2.getCar().getModel());
        System.out.println("Days-Rented: " + rental2.getDays());
    }
}
