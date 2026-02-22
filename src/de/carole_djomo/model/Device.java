package de.carole_djomo.model;
import javax.persistence.*;




@Entity
@Table(name = "device")
public class Device {
    private Integer id;
    private String name;

    /**
     * Konstruktor.
     */
    public Device() {
    }

    /**
     * Der Primary Key.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer anId) {
        this.id = anId;
    }

    /**
     * Der Name des Geräts.
     */
    @Column(name = "name")    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}