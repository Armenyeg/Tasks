public class ReverseToString {
   public String reverseString(String x)
    {
        if (x.isEmpty()){
            System.out.println("There is no string");
                    return x;
        } else {
            return reverseString(x.substring(1)) +x.charAt(0);
        }

    }

    public static void main(String[] args) {
       ReverseToString y = new ReverseToString();
       String z = y.reverseString(" Armenia ");
        System.out.println(y);
    }
}
