package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
@Data
@Table(name = "Bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bus_id;

    @JsonProperty("bus_number")
    @Column(name = "bus_number")
    private String bus_number;

    @JsonProperty("capacity")
    @Column(name = "capacity")
    private int capacity;

    @JsonProperty("bus_type")
    @Column(name = "bus_type")
    private String bus_type;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;
}
