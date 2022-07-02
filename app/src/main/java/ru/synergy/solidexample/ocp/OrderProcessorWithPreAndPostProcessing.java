package ru.synergy.solidexample.ocp;

import ru.synergy.solidexample.models.Order;
import ru.synergy.solidexample.srp.right.OrderProcessor; // импортируем класс удовлетворяющий SRP

public class OrderProcessorWithPreAndPostProcessing extends OrderProcessor {
    @Override
    public void process(Order order) {
        beforeProcessing(); // наследуемся
        super.process(order); // родительская реализация
        afterProcessing(); // после процессинга доделать какие-либо операции
    }
// реализовываем наши методы
    private void beforeProcessing() {
        // Осуществим некоторые действия перед обработкой заказа
    }

    private void afterProcessing() {
        // Осуществим некоторые действия после обработки заказа
    }

}
