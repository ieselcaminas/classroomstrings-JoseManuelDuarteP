public class Alfabetica {

    public static boolean esAlfabetica(String palabra) {

        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palabra = "chino";

        if (esAlfabetica(palabra)) {
            System.out.println("Es alfabetico");
        } else {
            System.out.println("No es alfabetico");
        }

    }
}