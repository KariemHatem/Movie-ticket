/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Electronica Care
 */
public class ConcreteTicket implements Ticket {
    private final String type;  // Immutable
    private final int price;  // Immutable

    // Constructor to initialize type and price
    public ConcreteTicket(String type, int price) {
        this.type = type;
        this.price = price;
    }

    // Getter for ticket type
    @Override
    public String getType() {
        return type;
    }

    // Getter for ticket price
    @Override
    public int getPrice() {
        return price;
    }

    // Clone method to create a new instance of ConcreteTicket with the same type and price
    @Override
    public Ticket clone() {
        return new ConcreteTicket(this.type, this.price);
    }
}