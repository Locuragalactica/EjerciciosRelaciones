
import java.util.Scanner;
import servicios.JuegoServicios;

public class Ejercicio3 {

    public static void main(String[] args) {
        /*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
         */
        Scanner leer = new Scanner(System.in);
        int rta;
        String rta2 = "";
        JuegoServicios js = new JuegoServicios();

        js.crearCartas();
        js.barajar();
        System.out.println("El mazo ha sido creado y barajado con exito.");

        System.out.println("------------------------------------------");

        do {
            System.out.println("\u001B[41m ----------MENU----------");
            System.out.println("\u001B[41m");
            System.out.println("\u001B[41m1- Pedir varias cartas");
            System.out.println("\u001B[41m2- Pedir una carta");
            System.out.println("\u001B[41m3- Ver Cartas de la mano");
            System.out.println("\u001B[41m4- Consultar pozo");
            System.out.println("\u001B[41m5- Ordenar mazo por números");
            System.out.println("\u001B[41m6- Ordenar mano por números");
            System.out.println("\u001B[41m7- Mezclar mazo");
            System.out.println("\u001B[41m8- Salir");

            rta = leer.nextInt();
            if (rta == 8) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    System.out.println("-------------------------------------");
                    js.darCartas();
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    js.siguienteCarta();
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    js.cartasMonton();
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    js.cartasDisponibles();
                    System.out.println("-------------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------------");
                    js.ordenarMazo();
                    System.out.println("-------------------------------------");
                    break;
                case 6:
                    System.out.println("-------------------------------------");
                    js.ordenarMano();
                    System.out.println("-------------------------------------");
                    break;
                case 7:
                    System.out.println("-------------------------------------");
                    js.barajar();
                    System.out.println("-------------------------------------");
                    break;

            }

        } while (!rta2.equals("s"));

    }

}
