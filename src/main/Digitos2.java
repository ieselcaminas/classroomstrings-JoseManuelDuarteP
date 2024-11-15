public class Digitos2 {

    public static int contarNumeros(String frase) {
        int contador = 0;
        String[] palabras = frase.split(" ");
        boolean comprobador;

        for (int i = 0; i < palabras.length; i++) {
            comprobador = true;

            for (int j = 0; j < palabras[i].length(); j++) {
                if (!Character.isDigit(palabras[i].charAt(j))) {
                    comprobador = false;
                    break;
                }
            } if (comprobador) contador++;

        }
        return contador;
    }

    public static void main(String[] args) {
        String frase = "20 hola 54 4re";
        System.out.println(contarNumeros(frase));
    }
}