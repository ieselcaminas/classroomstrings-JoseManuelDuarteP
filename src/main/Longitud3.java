public class Longitud3 {

    public static boolean longitud2(String frase, int num) {
        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= num)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String frase = "Que buen día";
        int num = 5;

        if (longitud2(frase, num))
            System.out.println("Todas son cortas");
        else
            System.out.println("Hay alguna larga");
    }
}