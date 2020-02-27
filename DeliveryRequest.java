/**
 * The DeliveryRequest class returns the message content,
 * and makes the messageContent immutable
 *
 * Assignment 2
 * Driver class
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 2.0
 * @since 2020-02-16
 */

package com.company;

public class DeliveryRequest {
    final String messageContent;        // An immutable object so that other classes cannot modify it

    public DeliveryRequest(String m) {
        this.messageContent = m;
    }
    public String getMessageContent() {
        return messageContent;
    }
}
