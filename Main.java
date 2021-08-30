package sesion05_cg_mul_b;
import java.util.Scanner;
{
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		 int x,y;
		 System.out.println ("Introduzca valores del vector de Traslacion: ");
		 System.out.println ("x: ");
		 x = entrada.nextInt();
		 System.out.println ("y: ");
		 y = entrada.nextInt();
		 Scanner entrada = new Scanner(System.in);
	}
}

class Coord {
    private int x, y;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
     public void setX(int x){
        this.x = x;
    }
       public void setY(int y){
        this.y = y;
    }
    
}

class Cuadrado {
    private Coord c;
    private int lado;
    private float grados;
    public Cuadrado(Coord c, int lado, float grados) {
        this.c = c;
        this.lado = lado;
	this.grados = grados;
    }
    public void Traslacion(Coord tr) {  // Complete los parámetros requeridos
        c.setX(tr.getX()+c.getX());
        c.setY(tr.getY()+c.getY());
    }
    public void Escalado(int es) {  // Complete los parámetros requeridos
        lado = (int)lado*(1+es/100.0f)
    }
    public void Rotacion(float rt) {  // Complete los parámetros requeridos
        x = setX*Math.cos(rt);
    }
}

class Circunferencia {
    Coord c;
    float radio;
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
}
