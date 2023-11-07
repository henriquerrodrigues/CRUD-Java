package marcio.henrique.ProjetoFinal.Controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import marcio.henrique.ProjetoFinal.Entities.Carrinho;
import marcio.henrique.ProjetoFinal.Repositories.CarrinhoRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 *
 * @author Marcio Martini
 */

@RestController
@AllArgsConstructor
public class CarrinhoController {
    CarrinhoRepository repository;
    
    @GetMapping("/carrinho")
    public List<Carrinho> getAllCarrinhos() {
        return repository.findAll();
    }
    
    @GetMapping("/carrinho/{id}")
    public Carrinho getCarrinhoById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
    
    @PostMapping("/carrinho")
    public Carrinho saveCarrinho(@RequestBody Carrinho carrinho) {
        return repository.save(carrinho);
    }
   
    @DeleteMapping("/carrinho/{id}")
    public void deleteCarrinho(@PathVariable Long id) {
            repository.deleteById(id);
    }    
}

    
