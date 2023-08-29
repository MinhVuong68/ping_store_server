package vn.com.ping.ping_store_api.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.ping.ping_store_api.model.Product;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductsResponse {
    private int page;
    private int totalPage;
    private List<Product> listResult = new ArrayList<>();
}
