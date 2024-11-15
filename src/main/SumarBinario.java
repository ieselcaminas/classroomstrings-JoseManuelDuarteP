public class SumarBinario {

    public static String sumaBinario(String bin1, String bin2) {
        String result = "";
        int acarreo = 0;
        int suma;

        for (int i = bin1.length() - 1; i >= 0; i--) {
            int digitoX = Integer.parseInt("" + bin1.charAt(i));
            int digitoY = Integer.parseInt("" + bin2.charAt(i));
            suma = digitoX + digitoY;

            if (suma == 0) {
                if (acarreo == 0) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                }
                acarreo = 0;
            } else if (suma == 1) {
                if (acarreo == 0) {
                    result = "1" + result;
                } else {
                    result = "0" + result;
                }
                acarreo = 0;
            } else {
                if (acarreo == 0) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                }
                acarreo = 1;
            }

        }

        if (acarreo == 1) result = "1" + result;


        return result;
    }

    public static void main(String[] args) {
        String bin1 = "1010";
        String bin2 = "1010";
        System.out.println(sumaBinario(bin1, bin2));
    }
}