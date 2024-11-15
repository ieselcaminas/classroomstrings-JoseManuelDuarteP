public class Parentesis {

    public static boolean esParentizada(String frase) {
        int parentesis = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '(') {
                parentesis++;
            } else if (frase.charAt(i) == ')') {
                parentesis--;
            }
            if (parentesis == -1) return false;
        }

        return (parentesis == 0);
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