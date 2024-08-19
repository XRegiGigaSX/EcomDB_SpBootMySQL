package com.rayyanshaikh.ecom.dto;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductDto {
    private Long Id;

    private String name;

    private long price;

    private String description;

    private byte[] byteImg;

    private Long categoryId;

    private String categoryName;

    private MultipartFile img;
}
