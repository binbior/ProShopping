package com.example.project_final_2.entity.invoice;

import com.example.project_final_2.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "invoiceId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "status")
    private String status;

    @Column(name = "totalMoney")
    private int totalMoney;

    @OneToMany(mappedBy = "invoice")
    private Set<InvoiceItems> invoice_items;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
