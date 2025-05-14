package demo.busticketmanagementsystem.model;

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
@Table(name = "Schedule")
public class Schedule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schedule_id;

    @ManyToOne(cascade = CascadeType.ALL,optional = true,fetch = FetchType.EAGER)
    @JsonProperty("bus_id")
//    @Column(name = "bus_id")
    @JoinColumn(name = "bus_id", referencedColumnName = "bus_id")
    private Bus bus_id;

    @ManyToOne(cascade = CascadeType.ALL,optional = true,fetch = FetchType.LAZY)
    @JsonProperty("route_id")
//    @Column(name = "route_id")
    @JoinColumn(name = "route_id",referencedColumnName = "route_id")
    private Route route_id;

    @JsonProperty("departure_date")
    @Column(name = "departure_date")
    private String departure_date;

    @JsonProperty("arrival_time")
    @Column(name = "arrival_time")
    private String arrival_time;

    @JsonProperty("departure_time")
    @Column(name = "departure_time")
    private String departure_time;


    @Getter @Setter
    @OneToMany( mappedBy = "schedule_id",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Ticket> tickets;

//
}
