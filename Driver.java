/**
 * The Driver class receives the message and broadcasts to the drivers
 *
 * Assignment 2
 * Driver class
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 2.0
 * @since 2020-02-16
 */

package com.company;

public class Driver implements Observer {

    public void update(DeliveryRequest m) {
        System.out.println("Driver gets the following message: " + m.getMessageContent());
    }
}
