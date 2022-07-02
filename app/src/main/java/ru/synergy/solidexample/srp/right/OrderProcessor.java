package ru.synergy.solidexample.srp.right;

import ru.synergy.solidexample.models.Order;

public class OrderProcessor {
    public void process(Order order){

        MySQLOrderRepository repository = new MySQLOrderRepository();// это не абстракция а реализация класса
        // абстрактыми является - абстракт классы, ветки наслед с родитет, и интерфейсы
        // интерфейс можн заново реализовать по другому ничего не ломая

        ConfirmationEmailSender mailSender = new ConfirmationEmailSender();
//так писать не хорошо, т.к. эти классы далеки от абстрактных классов


        if (order.isValid() && repository.save(order)) { // репозиторий  сам сохраняет данные
            mailSender.sendConfirmationEmail(order);
        }
    }

}

