package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.EncuentroRepository;

@Service
public class EncuentroService {

	@Autowired
	private EncuentroRepository encuentroRepository;

	public List<Encuentro> encuentros(Usuario u) {
		return this.encuentroRepository.findBySolicitante(u);
	}

	public void responderEncuentro(Encuentro e) {
		this.encuentroRepository.save(e);
	}

	public void solicitarEncuentro(Encuentro encuentro) {
		this.encuentroRepository.save(encuentro);
	}
}
