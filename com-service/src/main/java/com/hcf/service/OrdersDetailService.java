package com.hcf.service;

import com.hcf.dal.model.OrdersDetail;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jay.xiang
 * @create 2019/4/30 10:19
 */
@Service
public interface OrdersDetailService {

    /**
     * @param ordersDetail
     * @return
     */
    boolean saveOrderDetail(OrdersDetail ordersDetail);

    /**
     * @param orderId
     * @return
     */
    List<OrdersDetail> getDetailByOrderId(String orderId);

    /**
     * @param name
     * @return
     */
    List<OrdersDetail> getDetailByName(String name);

}
