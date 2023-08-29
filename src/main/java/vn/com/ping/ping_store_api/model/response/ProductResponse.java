package vn.com.ping.ping_store_api.model.response;

import lombok.*;
import vn.com.ping.ping_store_api.model.Brand;
import vn.com.ping.ping_store_api.model.Category;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private short modelYear;
    private double listPrice;
    private Brand brand;
    private Category category;
}
