package com.rayyanshaikh.ecom.entity;

import com.rayyanshaikh.ecom.dto.ProductDto;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private long price;

    @Lob
    @Column(columnDefinition = "longblob")
    private String description;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Category category;

    public ProductDto getDto(){
        ProductDto productDto = new ProductDto();

        productDto.setId(this.Id);
        productDto.setName(this.name);
        productDto.setPrice(this.price);
        productDto.setByteImg(this.img);
        productDto.setDescription(this.description);
        productDto.setCategoryId(category.getId());

        return productDto;
    }

}
