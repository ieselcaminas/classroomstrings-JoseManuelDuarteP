public class Digitos2 {

    public static int contarDigitos(String frase) {
        int contador = 0;
        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if (Character.isDigit(palabras[i].charAt(0)))
                contador++;

        }
        return contador;
    }

    public static void main(String[] args) {
        String frase = "20 hola 54";
        System.out.println(contarDigitos(frase));
    }
}