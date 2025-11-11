public class IOverloadingUsingDataTypes {
    
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(4,5));
        // System.out.println(add(4.5,5.8));       //error(it consider double by default)
        System.out.println(add(4.5f, 6.8f));
    }
}

