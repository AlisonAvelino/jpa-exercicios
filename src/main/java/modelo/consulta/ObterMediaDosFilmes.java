package modelo.consulta;

import infra.DAO;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class ObterMediaDosFilmes {

	public static void main(String[] args) {
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");
		
		System.out.println(nota.getMedia());
		
		dao.fechar();
	}
	
}
