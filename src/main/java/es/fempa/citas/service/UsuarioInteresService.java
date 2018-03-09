package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.Usuario_intereses;
import es.fempa.citas.repository.UsuarioInteresRepository;

@Service
public class UsuarioInteresService {

	@Autowired
	public UsuarioInteresRepository usuarioInteresRepository;

	public List<Usuario_intereses> interesDeUsuario(Usuario usuario) {
		return this.usuarioInteresRepository.findByIdUsuario(usuario);
	}
}
