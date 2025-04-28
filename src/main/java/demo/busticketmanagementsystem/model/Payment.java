package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Data
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_id;

    @JsonProperty("ticket_id")
    @Column(name = "ticket_id")
    private int ticket_id;

    @JsonProperty("payment_date")
    @Column(name = "payment_date")
    private String payment_date;

    @JsonProperty("amount")
    @Column(name = "amout")
    private String amount;

    @JsonProperty("payment_method")
    @Column(name = "payment_method")
    private String payment_method;
}
