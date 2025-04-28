package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Data
@Table(name = "Schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schedule_id;

    @JsonProperty("bus_id")
    @Column(name = "bus_id")
    private int bus_id;

    @JsonProperty("route_id")
    @Column(name = "route_id")
    private int route_id;

    @JsonProperty("departure_date")
    @Column(name = "departure_date")
    private String departure_date;

    @JsonProperty("departure_time")
    @Column(name = "departure_time")
    private String departure_time;

    @JsonProperty("arrival_time")
    @Column(name = "arrival_time")
    private String arrival_time;
}
