package me.whiteship.chapter01.item01;

import java.util.*;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        /*
        OrderStatus는 Enum타입이다.
        일반적으로 단순 텍스트를 통해 어떤 인터페이스의 구현체를 선택하는 것은 권장되지 않는다.
        EnumType은 지정된 타입을 통해 객체 구분에 강제성을 부여한다.
         */
        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
    }

}
