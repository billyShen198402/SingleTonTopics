package singleton;

/**
 * Created by billy on 2019/1/24.
 */
public class DoubleCheckedUsaullySafe {
    private static DoubleCheckedUsaullySafe instance;
    private DoubleCheckedUsaullySafe(){
        System.out.println("SingleTon has loaded...");
    }

    public static DoubleCheckedUsaullySafe getInstance(){
        if (instance == null){
            synchronized (DoubleCheckedUsaullySafe.class){
                if (instance == null){
                    instance = new DoubleCheckedUsaullySafe();
                }
            }
        }
        return instance;
    }
}
