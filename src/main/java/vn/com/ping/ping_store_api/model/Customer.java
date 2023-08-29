package vn.com.ping.ping_store_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "customers")
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    @Column(columnDefinition = "nvarchar(50)", nullable = false)
    private String firstName;
    @Column(columnDefinition = "nvarchar(50)", nullable = false)
    private String lastName;
    @Column(columnDefinition = "varchar(50)", unique = true)
    private String phone;
    @Column(columnDefinition = "nvarchar(50)", nullable = false, unique = true)
    private String email;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(columnDefinition = "nvarchar(50)")),
            @AttributeOverride(name = "city", column = @Column(columnDefinition = "nvarchar(50)")),
            @AttributeOverride(name = "state", column = @Column(columnDefinition = "nvarchar(50)")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "zip_code", columnDefinition = "varchar(6)")),
    })
    private Address address;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
