/**
 * Assignment 2
 * Subject interface
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 2.0
 * @since 2020-02-16
 */

package com.company;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(DeliveryRequest m);
}

