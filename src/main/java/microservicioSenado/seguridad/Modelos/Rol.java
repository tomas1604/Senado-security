package microservicioSenado.seguridad.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Rol {
    @Id
    private String _id;

    //Variables globales
    private String nombre;
    private String descripcion;


    public Rol(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Función para obtener el _id de mongo
     * @return _id
     */
    public String get_id(){
        return _id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
