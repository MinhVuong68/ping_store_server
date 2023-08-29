package vn.com.ping.ping_store_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "brands")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Brand {
    @Id
    @Column(name = "brand_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand_name", columnDefinition = "nvarchar(50)", nullable = false,unique = true)
    private String name;
    @OneToMany(mappedBy = "brand")
    @JsonIgnore
    private List<Product> products;
}
