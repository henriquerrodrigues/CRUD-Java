package marcio.henrique.ProjetoFinal.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    String produtos;
    int quantidade;
    double valor;
    
    
}
