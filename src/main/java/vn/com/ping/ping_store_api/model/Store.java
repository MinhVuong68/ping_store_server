package vn.com.ping.ping_store_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "stores")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long id;
    @Column(name = "store_name", columnDefinition = "nvarchar(50)", nullable = false, unique = true)
    private String name;
    @Column(columnDefinition = "nvarchar(50)", nullable = false, unique = true)
    private String phone;
    @Column(columnDefinition = "nvarchar(50)", nullable = false, unique = true)
    private String email;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "stress", column = @Column(columnDefinition = "nvarchar(50)", nullable = false)),
            @AttributeOverride(name = "city", column = @Column(columnDefinition = "nvarchar(50)", nullable = false)),
            @AttributeOverride(name = "state", column = @Column(columnDefinition = "nvarchar(50)", nullable = false)),
            @AttributeOverride(name = "zipCode", column = @Column(name = "zip_code", columnDefinition = "varchar(6)", nullable = false)),
    })
    private Address address;
    @OneToMany(mappedBy = "store")
    private Set<Stock> stocks;
    @OneToMany(mappedBy = "store")
    private Set<Staff> staffs;
}
