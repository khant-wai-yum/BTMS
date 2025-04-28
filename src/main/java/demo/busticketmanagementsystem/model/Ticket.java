package demo.busticketmanagementsystem.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Data
@Table(name = "Ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticket_id;

    @JsonProperty("passenger_id")
    @Column(name = "passenger_id")
    private int passenger_id;

    @JsonProperty("schedule_id")
    @Column(name = "schedule_id")
    private int schedule_id;

    @JsonProperty("seat_number")
    @Column(name = "seat_number")
    private int seat_number;

    @JsonProperty("booking_date")
    @Column(name = "booking_date")
    private String booking_date;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;
}
