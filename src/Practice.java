public class Practice {

    public static void main(String[] args) {
        practice1(); // Напишите программу, которая проверяет, является ли строка палиндромом
    }

    public static void practice1() {
        String word = "АнНА";
        String word1 = new String();
        for (int i = 0; i < word.length(); i++) {
            word1 = word.charAt(i) + word1;
        }
        System.out.println(word.equalsIgnoreCase(word1));
        word1 = new StringBuilder(word).reverse().toString();
        System.out.println(word.equalsIgnoreCase(word1));
    }
}
