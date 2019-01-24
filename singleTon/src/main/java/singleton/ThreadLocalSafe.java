package singleton;

/**
 * Created by billy on 2019/1/24.
 */
public class ThreadLocalSafe {
    private static final ThreadLocal<ThreadLocalSafe> instance =
            new ThreadLocal<ThreadLocalSafe>() {
                @Override
                protected ThreadLocalSafe initialValue() {
                    return new ThreadLocalSafe();
                }
            };

    public static ThreadLocalSafe getInstance(){
        return instance.get();
    }

    private ThreadLocalSafe(){}
}
