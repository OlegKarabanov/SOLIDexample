package ru.synergy.solidexample.dip;

import ru.synergy.solidexample.models.Order;

public class ConfirmationEmailSender implements MailSender {

    @Override
    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        // Шлем письмо клиенту
    }

}

