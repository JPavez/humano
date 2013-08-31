package Humano;

public class Punto {
	private int x;
	private int y;
	
	public Punto(){}
	
	public Punto(int xa, int ya){
		this.x = xa;
		this.y = ya;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "x: " + x + " y: " + y;
	}
}
