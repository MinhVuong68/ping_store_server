package vn.com.ping.ping_store_api.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StockPK implements Serializable {
    private Long store;
    private Long product;

    public StockPK() {
    }

    public StockPK(Long store, Long product) {
        this.store = store;
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockPK stockPK = (StockPK) o;
        return store.equals(stockPK.store) && product.equals(stockPK.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, product);
    }
}
