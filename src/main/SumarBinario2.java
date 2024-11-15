public class SumarBinario2 {

    public static String sumaBinario2(String bin1, String bin2) {
        String result = "";
        int acarreo = 0;
        int suma;
        int digitoX;
        int digitoY;

        for (int i = bin1.length() - 1; i >= 0; i--) {
            digitoX = Integer.parseInt("" + bin1.charAt(i));
            digitoY = Integer.parseInt("" + bin2.charAt(i));
            suma = digitoX + digitoY + acarreo;

            if (suma == 0) {
                result = "0" + result;
                acarreo = 0;
            } else if (suma == 1) {
                result = "1" + result;
                acarreo = 0;
            } else if (suma == 2) {
                result = "0" + result;
                acarreo = 1;
            } else {
                result = "1" + result;
                acarreo = 1;
            }
        }
        if (acarreo == 1) result = "1" + result;

        return result;
    }

    public static void main(String[] args) {
        String bin1 = "1010";
        String bin2 = "1010";
        System.out.println(sumaBinario2(bin1, bin2));
    }
}