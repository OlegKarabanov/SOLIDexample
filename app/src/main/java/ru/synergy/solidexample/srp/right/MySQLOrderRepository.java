package ru.synergy.solidexample.srp.right;

import ru.synergy.solidexample.models.Order;
import ru.synergy.solidexample.srp.wrong.MySqlConnection;

public class MySQLOrderRepository {
    public boolean save(Order order) {
        MySqlConnection connection = new MySqlConnection("database.url");
        // сохраняем заказ в базу данных

        return true;
    }
}


