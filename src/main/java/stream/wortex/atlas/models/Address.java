package stream.wortex.atlas.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "address")
public class Address {

    @Id
    private Integer id;

    private Integer houseNumber;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "street_id", referencedColumnName = "id", nullable = false)
    private Street street;

    @ManyToMany
    @JoinTable(
            name = "address_recycle_bin",
            joinColumns = @JoinColumn(name = "address_id"),
            inverseJoinColumns = @JoinColumn(name = "recycle_bin_id"))
    private List<RecycleBin> bins;

}
