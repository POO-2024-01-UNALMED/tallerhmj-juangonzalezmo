package futbol;

public class Futbolista implements Comparable{
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista (String nombre, int edad, String posicion){
		
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	
	public Futbolista(){
		
		this("Maradona", 30, "delantero");
		
	}
	
	
	public String toString() {
		
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
	}
	
	
	public boolean equals(Futbolista f) {
		
		if (this== f) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	
	public boolean jugarConLasManos() {
		
		return true;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getPosicion() {
		return posicion;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
