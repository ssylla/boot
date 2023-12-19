package fr.epsi.b32324c1.demoboot.repository;

import fr.epsi.b32324c1.demoboot.bo.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "mes-fournisseurs", collectionResourceRel = "tab")
public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

    @RestResource(path = "par-nom")
    List<Fournisseur> findByRaisonSocialeContaining(@Param("n") String nom);
}

