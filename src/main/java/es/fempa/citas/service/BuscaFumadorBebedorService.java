package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Busca;
import es.fempa.citas.repository.BuscaFumadorBebedorRespository;

@Service
public class BuscaFumadorBebedorService {

	@Autowired
	public BuscaFumadorBebedorRespository buscaFumadorBebedorRepository;

	public List<Busca> findAll() {
		return this.buscaFumadorBebedorRepository.findAll();
	}

	public void saveBuscaFumadorBebedor(Busca bFB) {
		this.buscaFumadorBebedorRepository.save(bFB);
	}

	public Busca buscarPorId(Integer idBuscaFumBeb) {
		return this.buscaFumadorBebedorRepository.buscaPorId(idBuscaFumBeb);
	}

}
