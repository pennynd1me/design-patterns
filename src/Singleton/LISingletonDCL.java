package Singleton;

import java.util.Objects;

// 2-2. Thread-safe Lazy Initialization + Double-checked locking 기법
public class LISingletonDCL {
    //private static (volatile)으로 선언
    private static volatile LISingletonDCL instance;

    //private 생성자
    private LISingletonDCL() {
    }

    //인스턴스 리턴
    public static LISingletonDCL getInstance() {
        //Double-checked locking
        if(Objects.isNull(instance)) {
            synchronized (LISingletonDCL.class) {
                if(Objects.isNull(instance)) {
                    instance = new LISingletonDCL();
                }
            }
        }
        return instance;
    }
}
