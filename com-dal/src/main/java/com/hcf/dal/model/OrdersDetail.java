package com.hcf.dal.model;

import lombok.Data;

/**
 * @author jay.xiang
 * @create 2019/4/29 19:05
 */
@Data
public class OrdersDetail {
    /**
     * 订单明细id
     */
    private String id;

    /**
     * 订单id
     */
    private String ordersId;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品属性
     */
    private String goodsKindname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsKindname() {
        return goodsKindname;
    }

    public void setGoodsKindname(String goodsKindname) {
        this.goodsKindname = goodsKindname;
    }
}
