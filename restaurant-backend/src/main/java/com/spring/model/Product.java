package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//@RequiredArgsConstructor
//I can't use both @NoArgsConstructor && @RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product extends BaseEntity implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "stored")
    private int stored;

    @JsonIgnore //this annotation solved this error 
                //Tomcat exception Cannot call sendError() after the response has been committed
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id") // foriegn key
    private Category category;
}
