package vn.com.ping.ping_store_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categories")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "category_name", columnDefinition = "nvarchar(50)", nullable = false,unique = true)
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
