public class StringCalculator {

    public static final String DELIMITER = ",";

    public static int calculate(String input) {
        return getResult(input);
    }

    private static int getResult(String input) {
        int result;
        if ("".equals(input)) {
            result = 0;
        } else if (input.contains(DELIMITER)) {
            int delimiterIndex = input.indexOf(DELIMITER);
            String firstPart = input.substring(0, delimiterIndex);
            String secondPart = input.substring(delimiterIndex + 1);
            result = parseSingleNumber(firstPart) + parseSingleNumber(secondPart);
        } else {
            result = parseSingleNumber(input);
        }
        return result;
    }

    private static int parseSingleNumber(String input) {
        return Integer.parseInt(input);
    }
}
