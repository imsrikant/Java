// reverse the string stored in array
/**
 * b
 */
public class b {

    public static void main(String[] args) {
        String str[] = {
                "To err is human",
                "This is a cat",
                "This is a dog"
        };
        printStr(str);
        reverseStrArr(str);
        printStr(str);

    }

    public static void reverseStrArr(String[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
    }

    public static void printStr(String[] str) {
        for (String string : str) {
            System.out.println(string);
        }
    }
}
