package gráficos;

import java.util.Comparator;

public class ComparadorObjetos implements Comparator<Object> {

	 @Override
     public int compare(Object o1, Object o2) {
         // Comparar los elementos relevantes en los arreglos
		 Object[] producto1 = (Object[]) o1;
		 Object[] producto2 = (Object[]) o2;
         return producto1.equals(producto2) ? 1 : 0;
     }

}
