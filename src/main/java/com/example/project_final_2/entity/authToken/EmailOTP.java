package com.example.project_final_2.entity.authToken;

import com.example.project_final_2.entity.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Random;

@Entity
@Table(name = "email_otp")
@Setter
@Getter
@NoArgsConstructor
public class EmailOTP {
    @Id
    @Column(name = "user_id")
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    private User user;

    @Column(name = "otp_code")
    private int otpCode;

    @Column(name = "expiry_time")
    private Instant expiryTime;

    public EmailOTP(User user, int otpCode) {
        this.user = user;
        this.otpCode = random.nextInt(900000) + 100000;;
    }

    public static Random random = new Random();
}

