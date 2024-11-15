public class Parentesis {

    public static boolean esParentizada(String frase) {
        int parAbierto = 0;
        int parCerrado = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '(') {
                parAbierto++;
            } else if (frase.charAt(i) == ')') {
                parCerrado++;
            }
        }

        if (parAbierto == parCerrado) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String frase = "(Real Académia Española)";

        if (esParentizada(frase)) {
            System.out.println("Está bien parentizada");
        } else {
            System.out.println("No está bien parentizada");
        }

    }
}