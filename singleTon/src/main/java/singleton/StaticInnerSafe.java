package singleton;

/**
 * Created by billy on 2019/1/24.
 */
public class StaticInnerSafe {
    private static class StaticInnerSafeHolder{
        private static StaticInnerSafe instance = new StaticInnerSafe();
    }

    private StaticInnerSafe(){
        System.out.println("SingleTon has loaded");
    }

    public static StaticInnerSafe getInstance(){
        return StaticInnerSafeHolder.instance;
    }
}
