package stream.wortex.atlas.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "recycle_bin")
@Entity
public class RecycleBin {

    @Id
    private Integer id;

    @Column(name = "recycle_bin_name")
    private String name;
}
