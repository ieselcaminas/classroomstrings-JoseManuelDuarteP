public class Pasatiempos {

    public static String convertir(String frase) {

        for (int i = 0; i < frase.length(); i++) {

            if ("aeiouAEIOU".indexOf(frase.charAt(i)) != -1) {
                frase = frase.replace(frase.charAt(i), '.');
            }

        }
        return frase;
    }

    public static void main(String[] args) {
        String frase = "Real Academia Española";
        System.out.println(convertir(frase));
    }
}