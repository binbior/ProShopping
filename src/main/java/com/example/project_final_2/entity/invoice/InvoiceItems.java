package com.example.project_final_2.entity.invoice;


import com.example.project_final_2.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "invoice_items")
public class InvoiceItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "invoiceId", nullable = false)
    private Invoice invoice;

    @Column(name = "total")
    private int totalItems;

    @Id
    @ManyToOne
    @JoinColumn(name = "itemId", nullable = false)
    private Product product;

    @Column(name = "numberItem")
    private Integer number;
}
