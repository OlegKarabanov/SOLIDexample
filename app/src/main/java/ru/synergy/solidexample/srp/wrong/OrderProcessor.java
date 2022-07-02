package ru.synergy.solidexample.srp.wrong;

import ru.synergy.solidexample.models.Order;

public class OrderProcessor {

    public void process(Order order){
        if (order.isValid() && save(order)) { // если ордер валидный проверяет его. что он сохранен
            sendConfirmationEmail(order);
        }
    }

    private boolean save(Order order) {
        MySqlConnection connection = new MySqlConnection("database.url");
        // сохраняем заказ в базу данных

        return true;
    }

    private void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        // Шлем письмо клиенту
    }
}

