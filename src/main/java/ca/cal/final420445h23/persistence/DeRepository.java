package ca.cal.final420445h23.persistence;

import ca.cal.final420445h23.modeles.De;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeRepository extends JpaRepository<De, Long> {
}
