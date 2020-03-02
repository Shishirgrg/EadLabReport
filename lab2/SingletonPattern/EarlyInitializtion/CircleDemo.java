public class CircleDemo{
    public static void main(String args[]){
        CircleObject c1 = CircleObject.getInstance();
        CircleObject c2 = CircleObject.getInstance();

        c1.showMessage();

        System.out.println(c1);
        System.out.println(c2);
    }
}