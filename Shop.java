/**
 * Shop class creates a list of drivers and has an ability to add and
 * remove drivers from the list, the class updates the message
 *
 * Assignment 2
 * Driver class
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 2.0
 * @since 2020-02-16
 */

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject {
    private List<Observer> drivers = new ArrayList<>();     // A list to store drivers

    public void attach(Observer o) {        // Method to store drivers
        drivers.add(o);
    }
    public void detach(Observer o) {        // Method to remove drivers from the list
        drivers.remove(o);
    }
    public void notifyUpdate(DeliveryRequest m) {       // Method to iterate through the list and update the messaage
        for (Observer o : drivers) {
            o.update(m);
        }
    }
}
