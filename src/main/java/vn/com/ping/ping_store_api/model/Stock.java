package vn.com.ping.ping_store_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "stocks")
@IdClass(StockPK.class)
public class Stock {
    @Id
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;
    private int quantity;
}
