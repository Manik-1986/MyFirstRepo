package JavaMetods;

public class Metod3 {
    public static void main(String[] args) {
        Metod3 obj = new Metod3();

        obj.greeting("Zara");

        System.out.println(obj.getNames("Den ", "Denver"));
        System.out.println(obj.getPrice( "Phone" ,  35500.30));
        System.out.println(obj.getPrice("apple", 150.10 ));
        



    }
     public void greeting(String name){
        String result = "Hello " + name;

    }

     public String getNames(String firstname, String lastname){
        String result = firstname + "" + lastname;
        return result + " --> " + getPrice("Pen", 15.50);
     }

     public String getPrice(String product, double price){
        return product + ":" +  price;
     }


     public int getResult(){
        int result1 = 10;
        int result2 = 45;
        int result3 = 98;
        int result4 = 12;
        return result1 + result2 + result3 + result4; /*так мы увидем только сложенное число так как метод return
        возвршается конкретное число, мы не сможем вызвать каждое число.*/

     }



}
