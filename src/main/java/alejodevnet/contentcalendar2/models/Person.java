package alejodevnet.contentcalendar2.models;
import jakarta.persistence.*;

@Entity
@Table(name="Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String age;

    @ManyToOne
    @JoinColumn(name="country_id")
    private String Country;
    @ManyToOne
    @JoinColumn(name="state_id")
    private String State;

    public Person(String firstName, String lastName, String age, String country, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        Country = country;
        State = state;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
