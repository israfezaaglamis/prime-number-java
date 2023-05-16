
public class Main {
    public static void main(String[] args) {


        int counter = 0;
        for (int number = 2; number <= 100; number++){

        int result = 0;
             for (int i  = 2; i < number ; i++){
                 if (number % i == 0){
                     result  = 1;
                     break;
                 }
             }
             if (result == 0){
                 System.out.println(number+"  \n");
                 counter++;

             }

           }


    }
}