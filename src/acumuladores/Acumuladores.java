package acumuladores;

public class Acumuladores {

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	
	
	public static boolean numNoPositivo (int  num) {
		
		
				if (num <= 0 ) {
					System.out.println(num + " no es positivo");
					return true;
				}
				return false; 
	}
	
	public static boolean esMultiplo (int op1, int op2)
	{
		System.out.println("Estoy en la funcion esMultiplo y los operadores son op1 = " + op1 + " y op2 = " + op2 );
		if ( op1%op2 ==0) {
			return true;
		}
	
		return false;
	}
	
	public static boolean analisisColumnaEsMultiplo (int [] columna, int op2) {
		
		
		
		System.out.println("La columna es " + columna);
		
		boolean ret = true;
		for (int i = 0; i< columna.length; i ++) {
			System.out.println("El numero que se va a analizar es "+ columna[i]);
			ret= ret & esMultiplo(columna[i], op2);
			if (ret == false) {
				return false;
			}
			System.out.println("El estado de ret es :" + ret );
			
		}
		return ret; 
	}
	
	public boolean matrizVacia (int [] [] mat) {
		
		if (mat.length == 0) {
			return true;
		}
		
		return false; 
	}
	
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int numExisteFilaDeMultiplos) {
		
		if (matrizVacia(mat)) 
			{return false;}
		
		System.out.println("El numero que ingresa como divisor es " + numExisteFilaDeMultiplos);
		
		if (numNoPositivo(numExisteFilaDeMultiplos)) {
			return false;
		}
		
		boolean ret = true;
		
		for (int c = 0; c< mat.length; c ++)
			{
			ret=true;
			System.out.println("Empieza analiss de la columna " + mat[c]+ "y el estadod e ret es " + ret);
			ret = ret &&analisisColumnaEsMultiplo (mat[c], numExisteFilaDeMultiplos);
			System.out.println("Finaliza analisis de la columna " + mat[c] + "y el estado de ret es  " + ret );
			if (ret == true) 
			{System.out.println("Son todos multipos ");
			return ret ;}}
					
		
		return ret;
				}
	
	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
	
	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
}
