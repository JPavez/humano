package Humano;

/**
 * Clase humano
 * @author alexis
 *
 */
public class Humano extends Animal implements Caminante {
	/** atributo de la clase Humano. Es publico de tipo int llamado dedos*/
	private String nom;
	private String ape;
	private double alt;
	private char sex;
	private int categoria;
	private int dni;
	public static final String raza = "Homo sapiens sapiens";
	
	/**
	 * Constructor de la clase Humano
	 * @param categoria int que representa el anio en que nacio el humano
	 */
	public Humano(int categoria, char sexo){
		
		// el constructor se llama igual que la clase, y no declara valor de retorno.
		//asigna al atributo categoria con el valor del argumento categoria.
		this.categoria = categoria;
		this.sex = sexo;
		this.pos = new Punto();
	}

	public String tunom(){
		return this.nom;
	}
	public void nomb(String newNomb){
		this.nom = newNomb;
	}
	public static String turaza(){
		return raza;
	}
	
	/**
	 * metodo de instancia que calcula e imprime por consola
	 * la edad de un humano segun un anio en particular
	 * @param newAnio int el anio para calcular la edad
	 */
	public void anio(int newAnio){
		/* asigna a una variable del metodo anio
		 * el resultado de la resta entre el parametro newAnio
		 * y el valor del atributo categoria
		 */
		int edad = newAnio - this.categoria;
		/* imprime por consola la variable edad.
		 * Como edad es un int java decide automaticamente
		 * convertirlo a String 
		 */
		System.out.println(edad);
		
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		String saludo = "Hola";
		return saludo;
	}
	
	@Override
	public Punto caminar (int x, int y){
		int xpos = pos.getX() + x;
		pos.setX(xpos);
		int ypos = pos.getY() + y;
		pos.setY(ypos);
		return this.pos;
	}
}
