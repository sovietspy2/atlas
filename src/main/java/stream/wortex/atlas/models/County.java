package stream.wortex.atlas.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "county")
public class County {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "county_name")
    private String name;

    @Column(name = "x")
    private Double xCoordinate;

    @Column(name = "y")
    private Double yCoordinate;


}
