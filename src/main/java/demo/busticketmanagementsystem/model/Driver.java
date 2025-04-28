package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Data
@Table(name = "Driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driver_id;

    @JsonProperty("full_name")
    @Column(name = "full_name")
    private String full_name;

    @JsonProperty("license_number")
    @Column(name = "license_number")
    private String license_number;

    @JsonProperty("phone_number")
    @Column(name = "phone_number")
    private String phone_number;

    @JsonProperty("assigned_bus_id")
    @Column(name = "assigned_bus_id")
    private int assigned_bus_id;
}
