package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Busca;
import es.fempa.citas.service.BuscaFumadorBebedorService;

@RestController
public class BuscaFumadorBebedorController {

	@Autowired
	private BuscaFumadorBebedorService buscaFumadorBebesorService;

	@GetMapping("/findAllBuscaFumadorBedor")
	public List<Busca> findAll() {
		return this.buscaFumadorBebesorService.findAll();
	}

	@PostMapping("/saveBuscaFumadorBebedor")
	public void saveInteres(@RequestBody Busca bFB) {
		this.buscaFumadorBebesorService.saveBuscaFumadorBebedor(bFB);
	}

	@GetMapping("/findBuscaFumadorBebedor/{idBuscaFumBeb}")
	public Busca buscarPorId(@PathVariable Integer idBuscaFumBeb) {
		return this.buscaFumadorBebesorService.buscarPorId(idBuscaFumBeb);
	}

	@PostMapping("/addBuscaFumadorBebedor")
	public void addBuscaFumadorBebedor(@RequestBody Busca bFB) {
		this.buscaFumadorBebesorService.saveBuscaFumadorBebedor(bFB);
	}

}
