package pl.aleh.customer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "cars")
public class Car {

  @Id
  private String vinNumber;
  private String make;
  private String model;
  private Type type;
  private String year;
  private Transmission transmission;
  private EngineType engineType;

  @ManyToOne
  @JoinColumn(name = "client_id")
  private Client client;

//  @OneToMany(mappedBy = "badge", cascade = CascadeType.ALL)
//  private List<Service> services;
}
