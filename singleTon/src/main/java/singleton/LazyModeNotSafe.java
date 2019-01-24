package singleton;

/**
 * Created by billy on 2019/1/24.
 */
public class LazyModeNotSafe {
    private static LazyModeNotSafe instance;
    private LazyModeNotSafe(){}

    public static LazyModeNotSafe getInstance(){
        if (instance == null){
            instance = new LazyModeNotSafe();
        }
        return instance;
    }
}
