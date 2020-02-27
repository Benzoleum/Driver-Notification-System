/**
 * Objects are created in the Main class and message is written
 *
 * Assignment 2
 * Driver class
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 2.0
 * @since 2020-02-16
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Driver d1 =  new Driver();
        Driver d2 =  new Driver();
        Driver d3 =  new Driver();
        Driver d4 =  new Driver();
        Driver d5 =  new Driver();
        shop.attach(d1);
        shop.attach(d2);
        shop.attach(d3);
        shop.attach(d4);
        shop.attach(d5);
        shop.notifyUpdate(new DeliveryRequest("Fish needs delivery"));
    }
}
