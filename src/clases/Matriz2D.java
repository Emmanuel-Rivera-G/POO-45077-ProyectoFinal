package clases;

public class Matriz2D<T> {
    private Object[][] matriz;

    public Matriz2D(int filas, int columnas) {
        this.matriz = new Object[filas][columnas];
    }

    public void setElemento(int fila, int columna, T elemento) {
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            throw new IllegalArgumentException("�ndices de matriz no v�lidos");
        }
        matriz[fila][columna] = elemento;
    }

    public T getElemento(int fila, int columna) {
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            throw new IllegalArgumentException("�ndices de matriz no v�lidos");
        }
        return (T) matriz[fila][columna];
    }

    public void imprimirMatriz() {
        for (Object[] fila : matriz) {
            for (Object elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
       }
    
    public int getFilas() {
    	return matriz.length;
    }
    public int getColumnas() {
    	return matriz[0].length;
    }
    
    public Object[][] getMatriz() {
    	return matriz;
    }
    
    public Object[] getFirstRow(int cant) {
    	Object[] array = new Object[cant];
    	int j = 0;
    	for (int i = 0; i < getColumnas(); i++) {
    		array[i] = matriz[0][i];
    	}
    	return array;
    }
    
    }