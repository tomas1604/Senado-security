package microservicioSenado.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import microservicioSenado.seguridad.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario, String> {
    @Query("{'correo':?0}")
    Usuario getUserByMail(String correo);
}
