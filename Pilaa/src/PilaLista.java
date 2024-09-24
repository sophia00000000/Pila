import java.util.ArrayList;

public class PilaLista {
	public static void main(String[] args) {
		ArrayList<Integer> pilaLista = new ArrayList();
		
		pilaLista.add(0,100);
		pilaLista.add(0,300);
		pilaLista.add(0,200);
		pilaLista.add(0,400);
		pilaLista.add(0,500);
		System.out.println(pilaLista.toString());
		pilaLista.remove(0);
		System.out.println(pilaLista.toString());
		System.out.println("Ultimo en la pila "+pilaLista.get(0));
		
	}

}
