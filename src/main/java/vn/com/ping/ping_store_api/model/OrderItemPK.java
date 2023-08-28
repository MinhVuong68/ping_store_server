package vn.com.ping.ping_store_api.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {
    private Long order;
    private Long product;

    public OrderItemPK() {
    }
    public OrderItemPK(Long order, Long product) {
        this.order = order;
        this.product = product;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return order.equals(that.order) && product.equals(that.product);
    }
    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }
}
