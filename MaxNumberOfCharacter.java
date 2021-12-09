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


public class Exercise3 {

    public static void main(String[] args)
    {
        String string1 = "This is Armen";
        String string2 = "This is Armenia";

        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        int result = string1.compareToIgnoreCase(string2);

        if (result < 0)
        {
            System.out.println(string1  + " smaller " + string2);
        }
        else if (result == 0)
        {
            System.out.println( string1  + " equal " + string2);
        } else {
            System.out.println("string1  + \" equal \" + string2");
        }
    }
}