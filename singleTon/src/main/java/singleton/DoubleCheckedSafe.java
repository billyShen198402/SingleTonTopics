package singleton;

/**
 * Created by billy on 2019/1/24.
 */
public class DoubleCheckedSafe {
    private static volatile DoubleCheckedSafe instance = null;

    private DoubleCheckedSafe() {
        System.out.println("SingleTon has been loaded...");
    }

    public static DoubleCheckedSafe getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSafe.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSafe();
                }
            }
        }
        return instance;
    }
}
