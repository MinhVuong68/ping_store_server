package vn.com.ping.ping_store_api.model;

import jakarta.persistence.*;

@Table(name = "order_items")
@Entity
@IdClass(OrderItemPK.class)
public class OrderItem {

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private double listPrice;
    @Column(nullable = false)
    private double discount;
}
