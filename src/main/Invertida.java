public class Invertida {

    public static String invertir(String frase) {
        String[] palabras = frase.split(" ");
        String invertida = "";

        for (int i = 0; i < palabras.length; i++) {
            invertida += palabras[palabras.length - i - 1] + " ";
        }
        return invertida;
    }

    public static void main(String[] args) {
        String frase = "Hol1s qu3 t4l";
        System.out.println(invertir(frase));
    }
}