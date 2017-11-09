package teste;

import java.util.ArrayList;

import dados.Cubo;
import dados.FormaGeometrica;
import dados.Quadrado;

public class Teste {

	private static ArrayList<FormaGeometrica> lista = 
			new ArrayList<FormaGeometrica>();
	
	public static void main(String[] args) {
		criarObjetos();
		listarObjetos();
		listarObjetosBidimensional();
		listarObjetosBidimensionalQuadrado();
		System.out.println("\nFinal");
		System.exit(0);

	}

	private static void listarObjetosBidimensionalQuadrado() {
		for (FormaGeometrica obj : lista) {
			if (obj instanceof Quadrado) {
				System.out.println(obj.toString());
			}
		}
		
	}

	private static void listarObjetosBidimensional() {
		for (FormaGeometrica obj : lista) {
			if (obj.getTipo()==FormaGeometrica.BIDIMENSIONAL){
				System.out.println(obj.toString());
			}
		}
		
	}

	private static void criarObjetos() {
		lista.add(new Quadrado(2));
		lista.add(new Quadrado(3));
		lista.add(new Quadrado(4));
		lista.add(new Cubo(2));
		lista.add(new Cubo(3));
		lista.add(new Cubo(4));
		
	}

	private static void listarObjetos() {
		for (FormaGeometrica obj : lista) {
			System.out.println(obj.toString());
		}
		
	}

}
