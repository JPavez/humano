package Humano;

public class Main {
	
	/**
	 * Metodo main ACA empieza el programa.
	 * 
	 * @param asd los parametros del programa (acordarse ejemplo de comando ls)
	 */
	public static void main(String[] asd){
		//Declaro una variable de tipo Humano llamada human y le asigno un nuevo objeto Humano
		//new Humano(1991); <= se llama al contructor de humano con el parametro 1991.
		Humano human = new Humano(1991, 'm');
		//llamo al metodo anio del objeto human definido en la clase Humano con el parametro 2013
		System.out.println(human.pos);		
		human.anio(2013);
		String nombre = "Jorgito";
		human.nomb(nombre);
		String nuevoNombre = human.tunom();
		System.out.println(human.pos);		
		System.out.println(nuevoNombre);
		System.out.println(human.pos);		
		System.out.println(human.pos);		
		System.out.println(human.pos);		
		//se asigna un nuevo humano a la variable human "pisando" el valor anterior de la variable human 
		human = new Humano(1986, 'm');
		System.out.println(human.pos);		
//llamo al metodo anio del objeto human definido en la clase Humano con el parametro 2014
		human.anio(2014);
		String validar = human.tunom();
		System.out.println (human.saludar());
		validar = "pepe";
		System.out.println(human.tunom());
		System.out.println(validar);
		
		Perro newPerro = new Perro();
		//effvevf
		System.out.println(newPerro.saludar());
		System.out.println(Humano.raza);
		System.out.println(human.pos);		
		System.out.println(human.caminar(20, 10));
		System.out.println("asdasdasdasdasdasdasd");		

		Caminante caminante = human;
		System.out.println(human.pos);		
		caminante.caminar(-10, -5);
		System.out.println(human.pos);		
		System.out.println(human.pos);		
	}
	
}
