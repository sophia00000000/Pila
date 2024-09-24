import java.util.Stack;

public class Pila {
	public static Stack<Integer> pila= new Stack();

	public static void main(String[] args) {
		
		pila.push(10);
		pila.push(10);
		pila.push(10);
		pila.push(10);
		
		System.out.println("ultimo dato en ingresar " + pila.peek());
		System.out.println("Numero de datos " + pila.size());
		
		System.out.println("saliendo el dato "+ pila.pop());
		System.out.println("la lista está vacia "+ pila.isEmpty());
	}

}
