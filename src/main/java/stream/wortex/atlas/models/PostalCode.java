package stream.wortex.atlas.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "postal_code")
@Data
public class PostalCode {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer value;
}
