package microservicioSenado.seguridad.Repositorios;

import microservicioSenado.seguridad.Modelos.PermisosRol;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RepositorioPermisosRol extends MongoRepository<PermisosRol,String> {
    @Query("{'rol.$id':ObjectId(?0), 'permiso.$id':ObjectId(?1)}")
    PermisosRol getPermisoRol(String id_rol, String id_permiso);
}
