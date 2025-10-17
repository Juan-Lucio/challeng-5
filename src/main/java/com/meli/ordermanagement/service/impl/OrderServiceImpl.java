package com.meli.ordermanagement.service.impl;

import com.meli.ordermanagement.entity.Order;
import com.meli.ordermanagement.exception.ResourceNotFoundException;
import com.meli.ordermanagement.repository.OrderRepository;
import com.meli.ordermanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        // La lógica de creación ahora es más simple, ya que el objeto Order
        // que recibimos ya debería tener el Cliente asociado.
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order updateOrder(Long id, Order orderDetails) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Orden no encontrada con id: " + id));

        // --- AJUSTES CLAVE ---
        // Actualizamos los campos de la orden existente con la información de 'orderDetails'.
        order.setCustomer(orderDetails.getCustomer()); // Usamos el objeto Customer completo
        order.setStatus(orderDetails.getStatus());
        order.setTotal(orderDetails.getTotal());
        order.setShippingAddress(orderDetails.getShippingAddress());
        // ---------------------

        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Orden no encontrada con id: " + id));
        orderRepository.delete(order);
    }
}