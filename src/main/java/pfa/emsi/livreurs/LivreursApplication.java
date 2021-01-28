package pfa.emsi.livreurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pfa.emsi.livreurs.service.ImplementDeliveryInitService;

@SpringBootApplication
public class LivreursApplication implements CommandLineRunner {

	@Autowired
	private ImplementDeliveryInitService deliveryInitService;

	public static void main(String[] args) {
		SpringApplication.run(LivreursApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		deliveryInitService.initVilles();
	}
}
