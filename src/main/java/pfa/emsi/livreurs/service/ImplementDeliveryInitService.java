package pfa.emsi.livreurs.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfa.emsi.livreurs.dao.CommandeRepository;
import pfa.emsi.livreurs.dao.LivreurRepository;
import pfa.emsi.livreurs.dao.UtilisateurRepository;
import pfa.emsi.livreurs.dao.VilleRepository;
import pfa.emsi.livreurs.entities.Ville;

import javax.transaction.Transactional;

@Service
@Transactional
public class ImplementDeliveryInitService implements DeliveryInitService {

    @Autowired
    private LivreurRepository livreurRepository;
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private VilleRepository villeRepository;


    @Override
    public void initVilles() {
        Stream.of("Casablanca", "Oujda", "Marrakech", "Rabat", "Tanger").forEach(nameVille -> {
            Ville ville = new Ville();
            ville.setNom(nameVille);
            villeRepository.save(ville);
        });
    }

    @Override
    public void initLivreurs() {

    }

    @Override
    public void initUtilisateurs() {

    }

    @Override
    public void initCommandes() {

    }
}
