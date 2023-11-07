package marcio.henrique.ProjetoFinal.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data  // faz o getters e setters sozinho
@AllArgsConstructor  // faz os construtores
@NoArgsConstructor  // construtores que não tem parametros
public class Clientes {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    Long id;
    String nome;
    String cpf;
    String rg;
    
}
