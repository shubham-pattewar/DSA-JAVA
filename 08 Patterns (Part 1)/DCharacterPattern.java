public class DCharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char mychar = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(mychar);
                mychar++;
            }
            System.out.println();
        }
    }
}
