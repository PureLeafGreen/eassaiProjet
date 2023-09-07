package ca.cal.final420445h23.services;

import ca.cal.final420445h23.modeles.De;
import ca.cal.final420445h23.persistence.DeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeService {

    private DeRepository deRepository;

    public DeService(DeRepository deRepository) {
        this.deRepository = deRepository;
    }

    public Optional<De> addNewDe(int nombredeface) {
        //Add new De to database with random value between 1 and nombredeface
        return Optional.of(deRepository.save(new De((int) (Math.random() * nombredeface + 1), nombredeface)));
    }

    public List<De> getAll() {
        return deRepository.findAll();
    }
}
