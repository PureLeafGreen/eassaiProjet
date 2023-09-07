package ca.cal.final420445h23.services;

import ca.cal.final420445h23.modeles.De;
import ca.cal.final420445h23.persistence.DeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

public class DeServiceTest {

    @Mock
    private DeRepository deRepository;

    private DeService deService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        deService = new DeService(deRepository);
    }

    @Test
    public void testAddNewDe() {
        int nombreDeFace = 6;
        int randomValue = 3;

        De de = new De(randomValue, nombreDeFace);
        Mockito.when(deRepository.save(Mockito.any(De.class))).thenReturn(de);

        Optional<De> result = deService.addNewDe(nombreDeFace);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(randomValue, result.get().getValeur());
        Assertions.assertEquals(nombreDeFace, result.get().getMaxValeur());

        Mockito.verify(deRepository, Mockito.times(1)).save(Mockito.any(De.class));
    }
}
