public class Siglas {

    public static String siglas(String frase) {
        String[] palabras = frase.split(" ");
        String siglas = "";

        for (int i = 0; i < palabras.length; i++) {
            if (Character.isUpperCase(palabras[i].charAt(0)))
                siglas += palabras[i].charAt(0);

        }
        return siglas;
    }

    public static void main(String[] args) {
        String frase = "Real Académia Española";
        System.out.println(siglas(frase));
    }
}