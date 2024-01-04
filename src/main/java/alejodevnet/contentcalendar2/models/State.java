package alejodevnet.contentcalendar2.models;
import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="State")

public class State implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="countryId")
    private String Country;
    private String name;
}
