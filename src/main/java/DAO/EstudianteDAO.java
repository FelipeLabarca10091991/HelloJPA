
package DAO;

import Db.Conexion;
import com.felipelabarcacorbalan.tienda.holamundojpa.Entitys.Estudiante;
import javax.persistence.EntityManager;

/**
 *
 * @author NB-FLABARCA
 */
public class EstudianteDAO {
    
    public void insertarEstudiante(Estudiante estudiante){
        
        EntityManager em = null;
        try{
            em = Conexion.createEntityManager();
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
            System.out.println("Guardado Correctamente");
        }catch (Exception ex) {
            System.out.println("Error al guardar :" + ex.getMessage());
        }finally{
            if (em != null){
                em.close();
            }
        }
    }
}
