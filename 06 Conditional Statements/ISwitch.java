public class ISwitch {
    public static void main(String[] args) {
        int number = 1;
        switch(number){
            case 1: System.out.println("task 1");
                    break;
            case 2: System.out.println("task 2");
                    break;
            case 3: System.out.println("task 3");
                    break;
            default: System.out.println("task undefined");
        }


        char ch = 'a';
        switch(ch){
            case 'a': System.out.println("char a");
                      break;
            case 'b': System.out.println("char b");
                      break;
            case 'c': System.out.println("char c");
                      break;
            default: System.out.println("char undefined");
        }
    }
}
