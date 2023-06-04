public class TestAddition {
    public static void main(String[] args) {
        //Without using lambda expression
        Addition abc = new AdditionImp();
        abc.add(10,20);
        abc.add(100,200);

        //using lambda expression
        Addition ab = (a,b)->{
            System.out.println("Addition of two numbers : "+(a+b));
        };
        ab.add(20,40);
        ab.add(200,400);
    }
}
