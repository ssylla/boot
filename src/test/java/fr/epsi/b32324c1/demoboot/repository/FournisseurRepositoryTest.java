package fr.epsi.b32324c1.demoboot.repository;

import fr.epsi.b32324c1.demoboot.bo.Fournisseur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FournisseurRepositoryTest {

    @Autowired
    private FournisseurRepository dao;

    @BeforeEach
    public void initFournisseur() {
        Fournisseur fournisseur = new Fournisseur("EPSI NTE");
        dao.save(fournisseur);
    }
    @Test
    public void testSave() {
        //A -> Arrangement
        Fournisseur fournisseur = new Fournisseur("EPSI NTE");

        //A -> Acting
        Fournisseur savedFournisseur = dao.save(fournisseur);

        //A -> Asserting
        assertNotNull(savedFournisseur.getId());
    }

    @Test
    void findByRaisonSociale() {
        //A -> Arrangement

        //A -> Acting
        List<Fournisseur> list = dao.findByRaisonSocialeContaining("EPSI NTE");

        //A -> Asserting
        assertNotEquals(0, list.size(), "Liste vide !");
    }
}