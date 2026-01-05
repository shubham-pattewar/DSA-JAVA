public class DFloydsTriangle {
    public static void FloydsTriangel(int n){
        int counter =1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloydsTriangel(5);
    }
}
