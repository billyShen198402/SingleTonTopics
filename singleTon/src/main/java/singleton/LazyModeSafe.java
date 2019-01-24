package singleton;

/**
 * Created by billy on 2019/1/24.
 */
public class LazyModeSafe {
    private static LazyModeSafe instance;
    private LazyModeSafe(){}

    public static synchronized LazyModeSafe getInstance(){
        if (null == instance){
            instance = new LazyModeSafe();
        }
        return instance;
    }
}
