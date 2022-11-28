package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SeleccionRepository<UsuarioModel> extends CrudRepository<UsuarioModel, Long>{

}
