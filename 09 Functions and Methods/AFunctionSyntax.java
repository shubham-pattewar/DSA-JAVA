public class AFunctionSyntax {
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static int printHelloWorld2(){
        System.out.println("Hello World 2");
        return 3;
    }

    public static void main(String[] args) {
        printHelloWorld();
        printHelloWorld();      // function call
        printHelloWorld2();
        System.out.println(printHelloWorld2()); // print Hello World 2 and also 3
    }
}
