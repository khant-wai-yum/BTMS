package demo.busticketmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Data
@Table(name = "Passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passenger_id;

    @JsonProperty("full_name")
    @Column(name = "full_name")
    private String full_name;

    @JsonProperty("email")
    @Column(name = "email")
    private String email;

    @JsonProperty("phone_number")
    @Column(name = "phone_number")
    private String phone_number;

    @JsonProperty("gender")
    @Column(name = "gender")
    private String gender;

}
