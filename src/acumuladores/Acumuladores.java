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
					//System.out.println(num + " no es positivo");
					return true;
				}
				return false; 
	}
	
	public static boolean esMultiplo (int op1, int op2)
	{
		//System.out.println("Estoy en la funcion esMultiplo y los operadores son op1 = " + op1 + " y op2 = " + op2 );
		if ( op1%op2 ==0) {
			return true;
		}
	
		return false;
	}
	
	public static boolean analisisColumnaEsMultiplo (int [] columna, int op2) {
		
		
		
		//System.out.println("La columna es " + columna);
		
		
		boolean ret = true;
		for (int i = 0; i< columna.length; i ++) {
			//System.out.println("El numero que se va a analizar es "+ columna[i]);
			ret= ret & esMultiplo(columna[i], op2);
			if (ret == false) {
				return false;
			}
			//System.out.println("El estado de ret es :" + ret );
			
		}
		return ret; 
	}
	
	public boolean matrizVacia (int [] [] mat) {
		
		if (mat.length == 0) {
			//System.out.println("La matriz está vacía");
			return true;
		}
		
		return false; 
	}
	
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int numExisteFilaDeMultiplos) {
		
		if (matrizVacia(mat)) 
			{return false;}
		
		//System.out.println("El numero que ingresa como divisor es " + numExisteFilaDeMultiplos);
		
		if (numNoPositivo(numExisteFilaDeMultiplos)) {
			return false;
		}
		
		boolean ret = true;
		
		for (int c = 0; c< mat.length; c ++)
			{
			ret=true;
			//System.out.println("Empieza analiss de la columna " + mat[c]+ "y el estadod e ret es " + ret);
			ret = ret &&analisisColumnaEsMultiplo (mat[c], numExisteFilaDeMultiplos);
			//System.out.println("Finaliza analisis de la columna " + mat[c] + "y el estado de ret es  " + ret );
			if (ret == true) 
			{//System.out.println("Son todos multipos ");
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
	
	
	public boolean identidadDeFilas (int[][] mat1, int[][]mat2) {
		
		//System.out.println("Matriz 1 :" + mat1.length  + "   Matriz 2 : " + mat2.length);
		
		if (mat1.length == mat2.length) {
			return true;
		}
		//System.out.println("No tienen la misma cantidad de filas");
		return false;
	} 
	
	
	public boolean interseccion (int [] fila1, int [] fila2) {
		
		//System.out.println("La fila 1 es ");
		for (int i= 0; i< fila1.length; i++) {
			//System.out.print(fila1[i] + " ");
		}
		//System.out.println("   ");
		//System.out.println("La fila 2 es ");
		for (int i= 0; i< fila2.length; i++) {
			//System.out.print(fila2[i] + " ");
		}
		
		//System.out.println("");
		boolean ret = false;
		for (int a=0; a< fila1.length; a ++) {
			//System.out.println("En el bucle de la fila 1 el nivel de revolucion es " + a );
			for (int b=0; b< fila2.length; b++) {
				//System.out.println("En el bucle de la fila 2 el nivel de revolucion es " + b);
			
			   //System.out.println("Se va a comparar  " +fila1[a] + " con " + fila2[b]);
				if (fila1[a] == fila2[b]) 
				{ret = true;
				//System.out.println("Hay coincidencia");
				return ret;}}
	
		}
		return ret;
	}
	
	
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		
		//System.out.println("Las matrices que se reciben son  " + mat1 + " y " + mat2 );
		
		boolean ret = true;
		if (matrizVacia(mat1) || matrizVacia(mat2)) {
			//System.out.println("Alguna de las matrices está vacia ");
			return false;
		}
		
		if (!(identidadDeFilas (mat1, mat2))) {
			return false;
		}
		
		
		for (int i=0; i<mat1.length; i++) {
			//System.out.println("Estoy en la revolucion " + i + " del bucle principal");
			//System.out.println("Las filas que se enviaran son :" + mat1[i] + " y " +  mat2[i]);
			
			ret = ret && interseccion (mat1[i], mat2[i]);
			//System.out.println("Luego de evaluar la interseccion ret es : "+ ret);
			if (ret == false) {
				return ret;
			} 
			
		
		}
		
		//System.out.println("Si sale del bucle es porque ret es verdadero y devuelve true " + ret );
		//System.out.println("Esta por terminar la funcion");
		//System.out.println("Va a retornar " + ret );
		
		return ret;
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
	
	
	public boolean comparaColumnaConFilas (int[] [] mat, int sumaColumna ) {
		
			boolean ret = true; 		
			
			for (int f = 0; f < mat.length; f++) {
				int suma = 0;
				//System.out.println("Se sumara la fila  " + f + " de la matriz");
				//System.out.print("La fila es  : ");
				for (int p=0; p< mat[0].length; p ++) {
					suma = suma + mat[f][p];
					//System.out.print(mat[f][p] + " ");
					
				}	
				//System.out.println(" ");
				//System.out.println("La suma total de la fila es " + suma);
				if (suma > sumaColumna) {
						ret = true;
						return ret;
				}	else {ret = false;}	
				}			
				return ret; 
			}
	
	
	public int sumaColumna (int [] columna) {
		
		//System.out.println("La columna que se sumará es : ");
		
		int suma=0;
		for (int i =0; i< columna.length; i++) {
			//System.out.print(columna[i] + " ");
			suma = suma + columna[i];
		}
		//System.out.println("");
		//System.out.println("La suma de la columna es : " + suma);
		return suma;
	}
	
	public  int []  separaColumna (int [] [] mat, int nColum) {
		
		//System.out.println("La cantidad de  columnas que tiene la matriz es  :" + mat[0].length);
		//System.out.println("La columna a sumar es : " + nColum );
		
		int [] columna;
		columna = new int [mat[0].length];
		int posicionNuevaColumna=0;
		for (int f=0; f< mat.length; f ++) {
			for (int i = 0; i < mat[0].length; i++) {
			
			//System.out.println("El indice i de la fila " + f + " es " + i + " y la columna con la que debe coincidir es " + nColum);
			if (i == nColum)
			{columna[posicionNuevaColumna]= mat [f][i];
			posicionNuevaColumna ++; 
			break;}
		}}
		
		//System.out.println("La columna que devuelve es :");
		for (int i =0; i< columna.length; i ++) {
			//System.out.print(columna[i] + " ");
			
		}
		//System.out.println(" ");
		return columna; 
	} 
	
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
			
		   if (matrizVacia (mat) ) {return false;}
		   
		   
		   if ((mat[0].length -1) < nColum || nColum < 0 ) {
			   return  false;}
		   
			boolean ret = true;
			
		   ret = comparaColumnaConFilas(mat, sumaColumna(separaColumna(mat, nColum)));
			
		   //System.out.println("El valor de retorno final es : " + ret );
		   
			return ret; 
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
