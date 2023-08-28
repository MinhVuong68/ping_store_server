package vn.com.ping.ping_store_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "staffs")
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Long id;
    @Column(columnDefinition = "nvarchar(50)", nullable = false)
    private String firstName;
    @Column(columnDefinition = "nvarchar(50)", nullable = false)
    private String lastName;
    @Column(columnDefinition = "nvarchar(50)", nullable = false, unique = true)
    private String email;
    @Column(columnDefinition = "varchar(50)", nullable = false, unique = true)
    private String phone;
    @Column(columnDefinition = "TINYINT")
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @OneToMany(mappedBy = "manager")
    @JsonIgnore
    private List<Staff> staffs;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    @JsonIgnore
    private Staff manager;
    @OneToMany(mappedBy = "staff")
    private List<Order> orders;
}
