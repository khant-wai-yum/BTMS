package demo.busticketmanagementsystem.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@Entity
@Data
@Table(name = "Ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticket_id;

    @JsonProperty("passenger_id")
    @ManyToOne(cascade = CascadeType.ALL,optional = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "passenger_id", referencedColumnName = "passenger_id")
    private Passenger passenger_id;

//    @Column(name = "passenger_id")
//    private Long passenger_id;

//    @ManyToOne
//    @MapsId("passenger_id")
//    @JoinColumn(name = "passenger_id")
//    Passenger passenger_id;

    @JsonProperty("schedule_id")
//    @Column(name = "schedule_id")
//    private Long schedule_id;

    @ManyToOne(cascade = CascadeType.ALL,optional = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "schedule_id", referencedColumnName = "schedule_id",insertable=false, updatable=false)
    private Schedule schedule_id;

//

//    @ManyToOne
//    @MapsId("schedule_id")
//    @JoinColumn(name = "schedule_id")
//    Schedule schedule_id;

    @JsonProperty("seat_number")
    @Column(name = "seat_number")
    private int seat_number;

    @JsonProperty("booking_date")
    @Column(name = "booking_date")
    private String booking_date;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;

//    @OneToOne(mappedBy = "ticket_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Payment payment;


    @OneToOne(mappedBy = "ticket_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Payment payment;
}
