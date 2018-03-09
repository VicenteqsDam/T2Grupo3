package es.fempa.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Busca;

public interface BuscaFumadorBebedorRespository extends JpaRepository<Busca, Integer> {

	@Query("select bFB from BuscaFumadorBebedor bFB where bFB.idBuscaFumBeb = ?1") // [?1] -- primer parametro de la
																					// funcion de abajo
	Busca buscaPorId(Integer idBuscaFumBeb);
}
