package ru.synergy.solidexample.lsp;

import ru.synergy.solidexample.models.Item;
import ru.synergy.solidexample.models.Order;

public class OrderStockValidator {

    public boolean isValid(Order order) {
        for (Item item : order.getItems()) { // перебираем фйтем через фор ич
            if (! item.isInStock()) { // если айтем не в стоке
                return false; // возращаем фолс иначе тру
            }
        }

        return true;
    }
}

