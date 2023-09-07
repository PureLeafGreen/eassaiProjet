package ca.cal.final420445h23.modeles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class De {
    @Id
    @GeneratedValue
    private Long id;
    private int valeur;
    private int maxValeur;

    public De(int value, int maxValeur) {
        this.valeur = value;
        this.maxValeur = maxValeur;
    }

    public Long getId() {
        return id;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int value) {
        this.valeur = value;
    }

    public int getMaxValeur() {
        return maxValeur;
    }

    public void setMaxValeur(int maxValue) {
        this.maxValeur = maxValue;
    }
}