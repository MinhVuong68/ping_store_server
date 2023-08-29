package vn.com.ping.ping_store_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.com.ping.ping_store_api.model.Product;
import vn.com.ping.ping_store_api.model.response.ProductResponse;
import vn.com.ping.ping_store_api.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{
    private final ProductRepository productRepository;
    @Override
    public List<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable).getContent();
    }

    @Override
    public int totalItem() {
        return (int) productRepository.count();
    }
}
