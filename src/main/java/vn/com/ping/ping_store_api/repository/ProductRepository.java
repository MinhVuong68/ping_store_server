package vn.com.ping.ping_store_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.ping.ping_store_api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
