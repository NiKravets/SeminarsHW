import java.util.Map;
import java.util.Stack;

public class HW5 {
    /*Необходимо определить, является ли последовательность скобок в строке правильной.
    Существует 3 вида скобок (), [], {} - из них мы составляем последовательно вида:
            "()[]{}" -> true,

            "()" -> true,
            "}]{[" -> false,
            "(]" -> false.
    Определить, какая из этих последовательность правильная - каждая открытая скобка должна закрывать скобкой того же вида.
    Для решения необходимо использовать Stack и Map.
*/
    public static void main(String[] args) {
        String brackets = "{[]";
        System.out.println(checkBracket(brackets));

    }

    public static boolean checkBracket(String brackets) {
        Stack<Character> stackBrackets = new Stack<>();
        Map<Character, Character> mapBrackets = Map.of('(', ')', '[', ']', '{', '}');

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);
            if (mapBrackets.containsKey(currentBracket)) {
                stackBrackets.push(currentBracket);
            } else {
                if (stackBrackets.isEmpty() || mapBrackets.get(stackBrackets.peek()) != currentBracket) {
                    return false;
                }
                stackBrackets.pop();
            }
        }
        return stackBrackets.isEmpty();
    }
}
