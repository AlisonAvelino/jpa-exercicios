package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo Leitão");
		
		/*Mesmo com o merge comentado ainda há modificações, pois estamos em 
		  um ambinete gerenciado*/
		
		//em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
}
