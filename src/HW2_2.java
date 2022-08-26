import java.util.ArrayList;

public class HW2_2 {
    //Задача: Задано уравнение вида q + w = e, q, w, e >= 0.
    // Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства.
    // Предложить хотя бы одно решение или сообщить, что его нет.
    // Входящие строки могут иметь любое количество символов, например, 2? + 1? = ??.

    static char[] textGlobal;
    static ArrayList<Integer> indexesGlobal = new ArrayList<>();

    public static void main(String[] args) {
        String text = "5? + ?2 = ?4";
        ArrayList<Integer> indexes = new ArrayList<>();
        char[] textChars = text.replaceAll(" ", "").toCharArray();
        for (int i = 0; i < textChars.length; i++) if (textChars[i] == '+' || textChars[i] == '=') textChars[i] = '-';
        for (int i = 0; i < textChars.length; i++) if (textChars[i] == '?') indexes.add(i);
        textGlobal = textChars;
        indexesGlobal = indexes;
        generateComb(new int[indexes.size()], 0, 10);
    }

    private static void generateComb(int[] arrays, int index, int k) {
        if (index == arrays.length) {
            checkComb(arrays);
            return;
        }
        for (int i = 0; i < k; i++) {
            arrays[index] = i;
            generateComb(arrays, index + 1, k);
        }
    }

    private static void checkComb(int[] arrays) {
        for (int i = 0; i < arrays.length; i++)
            textGlobal[indexesGlobal.get(i)] = Character.forDigit(arrays[i], 10);
        String[] numbers = String.valueOf(textGlobal).split("-");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        if (a + b == c) {
            System.out.printf("%d + %d = % d", a, b, c);
            System.out.println();
        }
    }
}
