package Scanner_;

public class StatementIfElse {
    public static void main(String[] args) {

        int age = 18;

        // 89 < 18 --> false код не запустится
        /*89 > 18 ---> true код запустится дальше
                после if () {обезательно открываем фигурны ковычки и закрываем после SOUT }*/

       /* if(age < 18){
            System.out.println("Cartoons");
        }
        else {
            System.out.println("Horror");*/

            int marks = 0;

            if(marks < 50){
                System.err.println("fail!"); // чтоб на консоле было отбражено красным мы пишеи systen err println
            }
            else if (marks >= 50 && marks < 60){
                System.out.println("D grade");
            }
            else if (marks >= 60 && marks < 70){
                System.out.println("C grade");
            }
            else if (marks >= 70 && marks < 80){
                System.out.println("B grade");
            }
            else if (marks >= 80 && marks < 90){
                System.out.println("A grade");
            }
            else if (marks >= 90 && marks <= 100){
                System.out.println("A+ grade");
            }
            else {
                System.err.println("Invaild points");
            }











    }
}
