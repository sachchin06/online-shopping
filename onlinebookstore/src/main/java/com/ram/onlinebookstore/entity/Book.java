package com.ram.onlinebookstore.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sku;
    private String name;
    private String description;
    @Column( name = "unit_price")
    private BigDecimal unitPrice;
    @Column( name = "image_url")
    private String imageUrl;
    private  Boolean active;
    @Column( name = "units_in_stock")
    private int unitsInStock;
    @Column( name = "date_created")
    private Date createdOn;
    @Column( name = "last_updated")
    private Date updatedOn;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private BookCategory category;

}
