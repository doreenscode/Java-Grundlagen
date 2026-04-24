import javax.xml.transform.Source;

public class Test {
    static void main(String[] args) {

    Test obj = new Test();
    System.out.println(obj.division(6, 2));
    System.out.println(obj.division(55, 5));
        try {
            System.out.println(obj.division(4, 0));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Division mit 0 nicht erlaubt");
        }
        System.out.println(obj.division(20, 4));
                System.out.println("all done!");
            }

            public int division(int a, int b){
                return a / b;
            }
        }

