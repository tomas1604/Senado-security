package microservicioSenado.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import microservicioSenado.seguridad.Modelos.Rol;

public interface RepositorioRol extends MongoRepository<Rol, String> {
}
