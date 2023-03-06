package codewars;

public class Main {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }

    public static String camelCase(String input) {
        StringBuilder builder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                builder.append(" ");
            }
            builder.append(c);
        }
        return builder.toString();
    }
}
