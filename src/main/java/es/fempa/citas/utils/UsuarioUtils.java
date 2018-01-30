package es.fempa.citas.utils;

import es.fempa.citas.domain.Usuario;

public class UsuarioUtils {

	public static Usuario getUsuarioLogeado() {
		Usuario u = new Usuario();
		u.setIdUsuario(1);
		return u;
	}
}
