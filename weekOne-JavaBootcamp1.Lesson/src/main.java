import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //İzmir Java Bootcamp First Lesson

        //write your code here
        System.out.println("Hello world.");
        Scanner input = new Scanner(System.in);
        /* primitive numeric data types
        byte b=1; //-2^7 ile(2^7)-1 8 bit
        short s=1; //-2^15 ile(2^15)-1 16 bit
        int i=1; //-2^31 ile(2^31)-1 32 bit
        long l=1; //-2^63 ile(2^63)-1 64 bit
        */

         /*
         final int y =1;
         //This is a constant variable. cannot be changed later.
          */

        /*
        double fah, cel;
        fah = 300;
        cel =5/9.0 *(fah-32);
        //if you use 9,result will be int. If you use 9.0, result will be double data type. This is true.
        System.out.println(fah+" fahrenheit is "+cel+" celcius");

        //Exp1
        System.out.println("Please, enter first number");
        int num1 = input.nextInt();
        System.out.println("Please, enter second number");
        int num2 = input.nextInt();
        int multipleNum = num1*num2;
        if(multipleNum>=10 && multipleNum<=100){
            System.out.println("Result is: "+multipleNum+" your score is 5.");
        }else if(multipleNum>100){
            System.out.println("Result is: "+multipleNum+" your score is 10.");
        }else{
            System.out.println("Result is: "+multipleNum+" your score is 0.");
        }
        */
        //Exp2
        /*
        System.out.println("Please, enter your age");
        int age = input.nextInt();
        switch (age){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Yaşınız 5-10 arasındadır.");
                break;
            case 15:
                System.out.println("Yaşınız 15dir.");
                break;
            default:
                System.out.println("Yaşınız: "+age);

        }
        */

        //String değer atama 2 türlü yapılır.

        String name1 = "Tugba", name2;
        name2 = new String("Tugba");

        System.out.println(name1.equals(name2)); //true çünkü burada iksiinin değerleri karşılaştırıldı.
        System.out.println(name1==name2);       //false burada veritipleri ve değerleri

    }


}




