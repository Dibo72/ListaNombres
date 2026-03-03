import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        List<String>nombres = new ArrayList<>();
        List<Integer> posicion = new ArrayList<>();

        do {
            System.out.println("Introduce un nombre: (fin para salir)");
            String nombre = sc.nextLine();
            if (nombre.equals("fin")) {
                seguir = false;
            }else{
                nombres.add(nombre);
            }
        }while (seguir);


        System.out.println("Introduce un nombre a buscar:");
        String nombre = sc.nextLine();

        for (int i=0; i<nombres.size(); i++) {
            if (nombres.get(i).equals(nombre)) {
                posicion.add(i+1);
            }
        }

        if (!posicion.isEmpty()) {
            System.out.println("Nombre encontrado en las posiciones:");
            System.out.println(posicion);
        }else{
            System.out.println("Nombre no encontrado");
        }
    }
}