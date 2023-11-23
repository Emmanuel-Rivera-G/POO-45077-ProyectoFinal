package clases;

import java.util.Comparator;

public class ComparadorUsuario implements Comparator<Usuario> {

	@Override
	public int compare(Usuario o1, Usuario o2) {
		int i = 0;
		if(o1.hashCode()>(o2.hashCode())) {
			i = 1;
		} else if (o1.hashCode()<(o2.hashCode())) {
			i = -1;
		}
		return i;
	}

}
