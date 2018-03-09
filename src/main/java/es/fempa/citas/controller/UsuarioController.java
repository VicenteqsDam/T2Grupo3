package es.fempa.citas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.UsuarioFiltro;
import es.fempa.citas.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/filtrarUsuarios")
	public Iterable<Usuario> filtrarUsuarios(@RequestBody UsuarioFiltro uf) {
		return this.usuarioService.filtrarUsuarios(uf);
	}

	@PostMapping("/guardarCambios")
	public void guardarCambios(@RequestBody Usuario u) {
		this.usuarioService.guardarCambios(u);
	}

	@GetMapping("/buscarIdUsuario/{idUsuario}")
	public Usuario buscarId(@PathVariable Integer idUsuario) {
		return this.usuarioService.buscarId(idUsuario);
	}
}
