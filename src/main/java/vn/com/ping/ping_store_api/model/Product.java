package vn.com.ping.ping_store_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name", columnDefinition = "nvarchar(50)", nullable = false,unique = true)
    private String name;
    @Column(nullable = false)
    private Short modelYear;
    @Column(nullable = false)
    private double listPrice;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany(mappedBy = "product")
    private Set<Stock> stocks;
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}
