public class Handler {

    private static int number1 = 0;
    private static int number2 = 0;
    private static char operation;

    public static void separate(String str) {
        char[] chars = str.toCharArray();
        boolean flagNumber = false;
        char curr;
        for (int i = 0; i < chars.length; i++) {
            curr = chars[i];
            if (curr == '0' || curr == '1' || curr == '2' || curr == '3' || curr == '4' || curr == '5' ||
                    curr == '6' || curr == '7' || curr == '8' || curr == '9'){
                if (!flagNumber) number1 += Integer.parseInt("" + chars[i]);
                else number2 += Integer.parseInt("" + chars[i]);
            } else {
                operation = chars[i];
                flagNumber = true;
            }
        }
    }

    public static String calculate() {

        String result = "";

        switch(operation) {
            case '+':
                result = Mathematics.addition(number1, number2);
                break;
            case '-':
                result = Mathematics.subtraction(number1, number2);
                break;
            case '*':
                result = Mathematics.multiplication(number1, number2);
                break;
            case '/':
                result = Mathematics.division(number1, number2);
                break;
            case '%':
                result = Mathematics.mod(number1, number2);
                break;
        }

        return result;
    }
}


