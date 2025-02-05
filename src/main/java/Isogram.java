import java.util.Arrays;

public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){

        char arr[] = str.toCharArray();
        Arrays.sort(arr);

        boolean result = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + " vs " + arr[i + 1]);
                return result = false;
            } else if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + " else " + arr[i + 1]);
                result = true;
            }
        }
        return result;
    }
}
