package vn.com.ping.ping_store_api.service;

import org.springframework.data.domain.Pageable;
import vn.com.ping.ping_store_api.model.Product;
import vn.com.ping.ping_store_api.model.response.ProductResponse;

import java.util.List;

public interface IProductService {
    List<Product> findAll(Pageable pageable);
    int totalItem();
}
