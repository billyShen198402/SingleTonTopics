package singleton;

/**
 * Created by billy on 2019/1/24.
 */
public class HungryModeSafe {
    private static HungryModeSafe instance = new HungryModeSafe();
    private HungryModeSafe(){}

    public static HungryModeSafe getInstance(){
        return instance;
    }
}
