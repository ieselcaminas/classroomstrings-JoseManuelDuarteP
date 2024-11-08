public class Longitud {

    public static int longitud(String frase, int num) {
        int con = 0;
        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == num) {
                con++;
            }
        }
        return con;
    }

    public static void main(String[] args) {
        String frase = "Que buen día";
        int num = 3;
        System.out.println(longitud(frase, num));
    }
}