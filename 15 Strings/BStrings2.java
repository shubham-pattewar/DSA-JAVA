public class BStrings2 {
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        // String Length
        String fullName = "Shubham Pattewar";
        System.out.println(fullName.length());

        // Concatenation
        String fn = "Shubham";
        String ln = "Pattewar";
        String full = fn + " " + ln;
        System.out.println(full);

        System.out.println(full.charAt(2));
        System.out.println(full.charAt(0));
        printLetters(full);
    }
}
