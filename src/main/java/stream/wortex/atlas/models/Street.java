package stream.wortex.atlas.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "street")
@Data
public class Street {

    @Id
    private Integer id;

    @Column(name = "street_name")
    //@JoinColumn(name = "street_name", referencedColumnName = "id", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "postal_code_id", referencedColumnName = "id", nullable = false)
    private PostalCode postalCode;
}
