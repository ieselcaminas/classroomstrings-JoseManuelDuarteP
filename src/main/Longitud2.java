public class Longitud2 {

    public static boolean longitud2(String frase, int num) {
        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String frase = "Que buen día";
        int num = 3;

        if (longitud2(frase, num)) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}