package com.cydeo.model;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    private BigDecimal amount;
    private Status paymentStatus;
    @OneToOne(cascade = CascadeType.ALL)
    private PaymentDetail paymentDetail;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Payment(LocalDate createdDate, BigDecimal amount, Status success) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;

    }
}
