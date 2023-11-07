package marcio.henrique.ProjetoFinal.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author Marcio Martini
 */

//@Table(name = "carrinho") // Nome da tabela no banco de dados
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    Long id;
    String produto;
    int quantidade;
    double valor;
    
}