package stream.wortex.atlas.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "city")
public class City {

    @Id
    private Integer id;

    @Column(name = "city_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "county_id", referencedColumnName = "id", nullable = false)
    private County county;
}
