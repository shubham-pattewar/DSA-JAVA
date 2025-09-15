public class AIfElse {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Adult: You can Vote");
        } 
        else {
            System.out.println("Not Adult: You can't vote");
        }

        if(age >13 && age < 18){
            System.out.println("Teenager");
        }


    }
}
