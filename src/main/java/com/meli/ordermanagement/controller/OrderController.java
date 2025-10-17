package com.meli.ordermanagement.controller;

import com.meli.ordermanagement.entity.Order;
import com.meli.ordermanagement.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar las operaciones CRUD de las órdenes.
 */
@RestController
@RequestMapping("/api/v1/orders") // URL base para todos los endpoints de este controlador
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * Endpoint para crear una nueva orden.
     * @param order Los datos de la orden a crear.
     * @return La orden creada con su ID y fecha.
     */
    @PostMapping
    public ResponseEntity<Order> createOrder(@Valid @RequestBody Order order) {
        Order newOrder = orderService.createOrder(order);
        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
    }

    /**
     * Endpoint para obtener todas las órdenes.
     * @return Una lista de todas las órdenes en el sistema.
     */
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    /**
     * Endpoint para obtener una orden por su ID.
     * @param id El ID de la orden a buscar.
     * @return La orden encontrada o un error 404 si no existe.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable(value = "id") Long id) {
        return orderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Endpoint para actualizar una orden existente.
     * @param id El ID de la orden a actualizar.
     * @param orderDetails Los nuevos datos para la orden.
     * @return La orden actualizada.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable(value = "id") Long id, @Valid @RequestBody Order orderDetails) {
        Order updatedOrder = orderService.updateOrder(id, orderDetails);
        return ResponseEntity.ok(updatedOrder);
    }

    /**
     * Endpoint para eliminar una orden por su ID.
     * @param id El ID de la orden a eliminar.
     * @return Una respuesta sin contenido (204 No Content).
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable(value = "id") Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}
