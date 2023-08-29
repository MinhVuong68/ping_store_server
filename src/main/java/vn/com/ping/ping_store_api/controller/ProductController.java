package vn.com.ping.ping_store_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.ping.ping_store_api.model.response.ProductsResponse;
import vn.com.ping.ping_store_api.service.IProductService;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService productService;
    @GetMapping("")
    public ResponseEntity<?> getProducts(
            @RequestParam("page") Integer page,
            @RequestParam(value = "limit", defaultValue = "10",required = false) Integer limit
    ) {
        ProductsResponse result = new ProductsResponse();
        Pageable pageable = PageRequest.of(page - 1, limit);
        result.setListResult(productService.findAll(pageable));
        result.setPage(page);
        result.setTotalPage((int) Math.ceil((double) (productService.totalItem())/limit));
        return ResponseEntity.ok(result);
    }
}
