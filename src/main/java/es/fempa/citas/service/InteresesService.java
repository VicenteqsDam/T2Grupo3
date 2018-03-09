package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Intereses;
import es.fempa.citas.repository.InteresesRespository;

@Service
public class InteresesService {
	
	@Autowired
	public InteresesRespository interesesRepository;
	
	public List<Intereses> findAll(){
		return this.interesesRepository.findAll();
	}
	
	public void saveInteres(Intereses i) {
		this.interesesRepository.save(i);
	}
	
	public Intereses buscarPorId(Long idIntereses) {
		return this.interesesRepository.findByIdIntereses(idIntereses);
	}

}
