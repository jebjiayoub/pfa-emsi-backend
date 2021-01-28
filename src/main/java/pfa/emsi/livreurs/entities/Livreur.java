package pfa.emsi.livreurs.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Livreur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String CIN;
    private String nom;
    private String email;
    private String phone;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "livreur")
    private Collection<Commande> commandes;
}
