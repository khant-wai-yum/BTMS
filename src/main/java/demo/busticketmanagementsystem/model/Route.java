package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Data
@Entity
@Table(name = "Route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
