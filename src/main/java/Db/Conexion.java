
package Db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author NB-FLABARCA
 */
public class Conexion {
    
    private static EntityManagerFactory emf = null;
    
    public static EntityManager createEntityManager(){
        
        try{
            
            if ( emf == null){
            emf = Persistence.createEntityManagerFactory("helloJPA_PU");
                System.out.println("Conexión exitosa!");
        }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return emf.createEntityManager();
    }
    
}
