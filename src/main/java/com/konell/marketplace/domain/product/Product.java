package com.konell.marketplace.domain.product;

import com.konell.marketplace.dtos.ProductDTO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity(name = "products")
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer stock;

    @CreationTimestamp
    @Column(updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    public Product(ProductDTO productDTO) {
        this.name = productDTO.name();
        this.description = productDTO.description();
        this.price = productDTO.price();
        this.stock = productDTO.stock();
    }
}
