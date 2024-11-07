package com.lahsaini.backendshop.service.order;

import com.lahsaini.backendshop.dto.OrderDto;
import com.lahsaini.backendshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}

