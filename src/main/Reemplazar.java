import java.util.Scanner;
public class Reemplazar {

    public static String reemplazar(String palabra, int letraOG, char letraNueva) {
        String palabraReemplazado;
        palabraReemplazado = palabra.toLowerCase();

        for (int i = 0; i < palabraReemplazado.length(); i++) {
            if (i == letraOG) {
                palabraReemplazado = palabraReemplazado.replace(palabraReemplazado.charAt(i), letraNueva);
                break;
            }
        }
        return palabraReemplazado;
    }

    public static void main(String[] args) {
        String palabra;
        int letraOG;
        char letraNueva;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        palabra = sc.nextLine();

        System.out.print("Ingrese la posición de la letra a sustituir: ");
        letraOG = sc.nextInt();

        System.out.print("Ingrese la nueva letra: ");
        letraNueva = sc.next().charAt(0);

        System.out.println(reemplazar(palabra, letraOG, letraNueva));
    }
}
