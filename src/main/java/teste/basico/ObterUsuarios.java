package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Forma separada
		/*String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);*/
		
		//Forma encadeada
		List<Usuario> usuarios = em
				.createQuery("SELECT u FROM Usuario u", Usuario.class)
				.setMaxResults(5)
				.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: "+ usuario.getId()
					+ " E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}
}
