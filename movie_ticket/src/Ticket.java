/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Electronica Care
 */
public interface Ticket {
    Ticket clone();  // This allows cloning of tickets

    int getPrice();  // Returns the price of the ticket

    String getType();  // Returns the type of the ticket as a String
}
