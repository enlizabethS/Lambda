import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        Operationable sum = new Operationable() {
//            @Override
//            public int calculate(int x, int y) {
//                return x + y;
//            }
//        };
//        System.out.println(sum.calculate(9, 12));
//
//        // лямбда
//
//        Operationable subtraction = (a, b) -> a - b;
//        Operationable subtraction2 = (a, b) ->{return a-b;};
//        int randomNumberFromScope = 9;
//        Operationable subtraction3 = (a, b) ->{
//            System.out.println("Хехей!");
//            System.out.println(randomNumberFromScope);
//            return a-b;
//        };
//
//
//        System.out.println(subtraction.calculate(12, 9));
//        System.out.println(subtraction.calculate(16, 5));
//
//
//
//        VoidF<String> printS = (str) -> System.out.println(str);
//        printS.print("Hello, I'm terminal lambda");
//        VoidF<Integer> printI = (integer) -> System.out.println(integer);
//        printI.print(125);
//        NoArg losung = () -> System.out.println("Слабоумие и отвага");
//        losung.printLosung();

        Number division = (a) -> {
            if (a%12==0) {
                return  true;
            } else {
                return false;
            }
        };
        System.out.println(division.numberDivision(230));

        Number dev = (x)-> x%12==0;
        System.out.println(dev.numberDivision(12));

        Number division2 = (b) -> {
            if (b%24==0) {
                return  true;
            } else {
                return false;
            }
        };
        System.out.println(division2.numberDivision(288));

        LambdaStrLong strLong = (a , b) -> {
            if (a.length() > b.length()){
               return a;
            } else{
               return b;
            }
        };
        System.out.println(strLong.getLambdaLong("agfghsjsg", "dffhh"));

        LambdaStrLong strLong2 = (a , b) -> {
            if (a.length() > b.length()){
                return a.toUpperCase().replaceAll(","," ");
            } else{
                return b.toUpperCase().replaceAll(","," ");
            }
        };
        System.out.println(strLong2.getLambdaLong("Hi, how are you?", "Hi,good"));

        System.out.println("-------------");
        System.out.println(doSmthWithStr("Jerry G", (a) -> a.toUpperCase()));

    }
    public static String doSmthWithStr (String str,OneArgInt argInt){
        return argInt.action(str);
    }
   
}