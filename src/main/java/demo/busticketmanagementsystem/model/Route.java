package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter @Setter
@Data
@Entity
@Table(name = "Route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private Long route_id;

    @JsonProperty("start_point")
    @Column(name = "start_point")
    private String start_point;

    @JsonProperty("end_point")
    @Column(name = "end_point")
    private String end_point;

    @JsonProperty("total_distance")
    @Column(name = "total_distance")
    private float total_distance;


    @Getter @Setter
    @OneToMany( mappedBy = "route_id",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Schedule> schedules;
}
