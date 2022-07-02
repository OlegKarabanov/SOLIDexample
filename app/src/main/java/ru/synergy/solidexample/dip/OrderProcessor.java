package ru.synergy.solidexample.dip;

import ru.synergy.solidexample.models.Order;

public class OrderProcessor { // сконфигурировали

    private MailSender mailSender; // передали
    private OrderRepository repository; // передали

    public OrderProcessor(MailSender mailSender, OrderRepository repository) {// наши зависимости получаем через конструктор
        this.mailSender = mailSender;
        this.repository = repository;
    }

    public void process(Order order){
        if (order.isValid() && repository.save(order)) {
            mailSender.sendConfirmationEmail(order);
        }
    }
}
