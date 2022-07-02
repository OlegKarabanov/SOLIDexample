package ru.synergy.solidexample.dip;

import ru.synergy.solidexample.models.Order;

public interface OrderRepository {
    boolean save(Order order);
}

