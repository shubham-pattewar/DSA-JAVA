public class BArrayasFxnArgument {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 50;
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int nonChangable = 5;
        int marks[] = {97,98,99};
        update(marks, nonChangable);

        for(int i = 0; i < marks.length; i++){
         System.out.println(marks[i]+ " ");     // only array changes
        }

        System.out.println(nonChangable);       //this integer doesn't changes
    }
}
