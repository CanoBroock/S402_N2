package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n02.model.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
}
