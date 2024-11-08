public class Digitos {

    public static int contarDigitos(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (Character.isDigit(frase.charAt(i)))
                contador++;

        }
        return contador;
    }

    public static void main(String[] args) {
        String frase = "Hol1s qu3 t4l";
        System.out.println(contarDigitos(frase));
    }
}