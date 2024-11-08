public class Cadenas {
    public static void main(String[] args) {
        String cadena = "hola hola?";
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
        cadena = cadena.toUpperCase();
        System.out.println(cadena);

        cadena = cadena.toLowerCase();
        System.out.println(cadena);

        cadena = cadena.replace("o", "e");
        System.out.println(cadena);

        cadena = cadena.trim();    //no para espacios entre palabras
        System.out.println(cadena);

        cadena = cadena.substring(2);
        System.out.println(cadena);

        cadena = cadena.substring(1, 7);
        System.out.println(cadena);

        System.out.println(cadena.endsWith("?"));
    }
}
