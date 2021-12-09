public class MaxNumberOfCharacter {
    static char maxNumberOfcharacter(char str[]) {
        int array [] = new int[26];
        int max = -1;
        char result = 0;
        int lenght = str.length;
        for (int i = 0; i < lenght; i++) {
            if (str[i] != ' ') {
                array[str[i] - 'a'] ++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (max < array[i]) {
                max = array[i];
                result = (char) (i + 'a');
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char str[] = "Hello World Program".toCharArray();
        System.out.println("number of character is "
                + maxNumberOfcharacter(str));
    }
};