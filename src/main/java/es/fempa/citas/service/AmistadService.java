package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Amistad;
import es.fempa.citas.domain.PKAmistad;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.repository.AmistadRepository;

@Service
public class AmistadService {

	@Autowired
	private AmistadRepository amistadRepository;

	public List<Amistad> solicitudesAmistad(Usuario solicitado) {
		Boolean estado = new Boolean(false);
		return this.amistadRepository.findByAmistadSolicitadoAndEstado(solicitado, estado);
	}

	public List<Amistad> misAmigos(Usuario usuario) {
		Boolean estado = new Boolean(true);
		return this.amistadRepository.findByAmistadSolicitanteAndEstadoOrAmistadSolicitadoAndEstado(usuario, estado,
				usuario, estado);
	}

	public void saveAmistad(Usuario solicitante, Usuario solicitado) {
		Amistad amistad = new Amistad();
		PKAmistad pkAmistad = new PKAmistad();
		pkAmistad.setSolicitante(solicitante);
		pkAmistad.setSolicitado(solicitado);
		amistad.setAmistad(pkAmistad);
		amistad.setEstado(false);
		this.amistadRepository.save(amistad);
	}

	public void responderAmistad(Amistad a) {
		this.amistadRepository.save(a);
	}
}
