public class Palindromo {

    public static boolean esPalindromo(String frase) {
        frase = frase.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i < frase.length() - 1; i++) {
            if (frase.charAt(i) != frase.charAt(frase.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String frase = "Anita lava la tina";
        if (esPalindromo(frase)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Nao palindromo");
        }
    }
}