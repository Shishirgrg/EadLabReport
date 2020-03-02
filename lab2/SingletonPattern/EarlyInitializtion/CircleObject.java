public class CircleObject{
    private static CircleObject instance;

    private CircleObject(){

    };

    public static CircleObject getInstance(){
        if(instance == null){
            instance = new CircleObject()
;        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Lazy initialization");
    }
}