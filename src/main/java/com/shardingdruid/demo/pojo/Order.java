package com.shardingdruid.demo.pojo;

public class Order {

    private Long orderId;
    public Long getOrderId() {
        return this.orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private String goodsName;
    public String getGoodsName() {
        return this.goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
