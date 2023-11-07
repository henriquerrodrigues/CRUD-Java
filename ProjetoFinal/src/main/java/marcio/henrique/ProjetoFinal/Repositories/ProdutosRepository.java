package marcio.henrique.ProjetoFinal.Repositories;

import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import marcio.henrique.ProjetoFinal.Entities.Produtos;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marcio Martini
 */
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
    public Object findById(SingularAttribute<AbstractPersistable, Serializable> id);
}
