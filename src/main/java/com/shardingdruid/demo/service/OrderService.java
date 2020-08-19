package com.shardingdruid.demo.service;

import com.shardingdruid.demo.pojo.Order;

import java.util.List;

public interface OrderService {
    public boolean addOneOrder(Order userOne);
    public List<Order> getAllOrder();
}
