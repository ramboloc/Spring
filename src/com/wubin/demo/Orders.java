package com.wubin.demo;


/**
 * 使用有参构造注入
 */
public class Orders {
    private String orderName;
    private String address;

    public Orders(String orderName, String address) {
        this.orderName = orderName;
        this.address = address;
    }

    public void testDemo(){
        System.out.println("订单名称："+orderName);
        System.out.println("订单地址："+address);
    }
}
