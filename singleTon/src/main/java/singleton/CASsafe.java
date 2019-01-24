package singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by billy on 2019/1/24.
 */
public class CASsafe {
    private static final AtomicReference<CASsafe> INSTANCE = new AtomicReference<CASsafe>();

    private CASsafe(){}

    public static final CASsafe getInstance(){
        for(;;){
            CASsafe current = INSTANCE.get();
            if (current!=null){
                return current;
            }
            current = new CASsafe();
            if (INSTANCE.compareAndSet(null,current)){
                return current;
            }
        }
    }

    public static void main(String[] args) {
        CASsafe instance01 = CASsafe.getInstance();
        CASsafe instance02 = CASsafe.getInstance();
        System.out.println(instance01 == instance02);
    }
}
