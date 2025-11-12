public class PBlockScope {
    public static void main(String[] args) {
        int p = 10;
        {
            int s = 100;
            System.out.println(p);      // p is in the function scope so it can be accessible in the whole function(no error)
        }
        // System.out.println(s);       //error

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        // System.out.println(i);       // error (i is valid this the scope of for loop only)
    }
}
