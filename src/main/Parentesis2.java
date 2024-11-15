public class Parentesis2 {

    public static boolean esParentizada2(String frase) {
        int parentesis = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '(') {
                parentesis++;
            } else if (frase.charAt(i) == ')') {
                parentesis--;
            }
        }

        return (parentesis == 0);
    }

    public static void main(String[] args) {
        String frase = "(Real Académia Española)";

        if (esParentizada2(frase)) {
            System.out.println("Está bien parentizada");
        } else {
            System.out.println("No está bien parentizada");
        }

    }
}