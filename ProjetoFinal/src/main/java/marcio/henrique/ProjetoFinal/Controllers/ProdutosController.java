package marcio.henrique.ProjetoFinal.Controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import marcio.henrique.ProjetoFinal.Entities.Produtos;
import marcio.henrique.ProjetoFinal.Repositories.ProdutosRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author Marcio Martini
 */


@RestController
@AllArgsConstructor

public class ProdutosController {
    
    ProdutosRepository repository;
    
    @GetMapping("/produtos")
    public List<Produtos> getAllProdutos() {
        return repository.findAll();
    }
    
    @GetMapping("/produtos/{id}")
    public Produtos getProdutoById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
    
    @PostMapping("/produtos")
    public Produtos saveProdutos(@RequestBody Produtos produto) {
        return repository.save(produto);
    }
   
    @DeleteMapping("/produtos/{id}")
    public void deleteProdutos(@PathVariable Long id) {
            repository.deleteById(id);
    }    
}
    
    
    

