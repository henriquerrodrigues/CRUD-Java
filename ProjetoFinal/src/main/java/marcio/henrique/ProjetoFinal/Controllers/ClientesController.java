package marcio.henrique.ProjetoFinal.Controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import marcio.henrique.ProjetoFinal.Entities.Clientes;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import marcio.henrique.ProjetoFinal.Repositories.ClientesRepository;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 *
 * @author Marcio Martini
 */

@RestController
@AllArgsConstructor
public class ClientesController {
    
    ClientesRepository repository;
    
    @GetMapping("/clientes")
    public List<Clientes> getAllClientes() {
        return repository.findAll();
    }
    
    @GetMapping("/clientes/{id}")
    public Clientes getClientesById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
    
    @PostMapping("/clientes")
    public Clientes saveCliente(@RequestBody Clientes cliente) {
        return repository.save(cliente);
    }
   
    @DeleteMapping("/clientes/{id}")
    public void deleteCliente(@PathVariable Long id) {
            repository.deleteById(id);
    }    
}
