package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonProperty("payment_date")
    @Column(name = "payment_date")
    private String payment_date;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonProperty("ticket_id")
//    @JoinColumn(name = "ticket_id", referencedColumnName = "ticket_id", insertable = false, updatable = false )
//    private Ticket ticket;



    @OneToOne
    @JoinColumn(name = "ticket_id", referencedColumnName = "ticket_id", insertable = false, updatable = false)
    private Ticket ticket_id;

}
