package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter @Setter
@Entity
@Data
@Table(name = "Bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
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

    @Getter @Setter
    @OneToMany( mappedBy = "bus_id",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Schedule> schedules;


    @OneToOne(mappedBy = "bus", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Drivers driver;
}
