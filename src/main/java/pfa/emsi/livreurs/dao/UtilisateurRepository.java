package pfa.emsi.livreurs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import pfa.emsi.livreurs.entities.Utilisateur;

@CrossOrigin("*")
@RepositoryRestResource
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
