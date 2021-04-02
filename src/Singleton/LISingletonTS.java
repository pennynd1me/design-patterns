package Singleton;

import java.util.Objects;

// 2-1. Thread-safe Lazy Initialization (스레드-안전한 늦은 초기화)
public class LISingletonTS {
    //private static 으로 선언
    private static LISingletonTS instance;

    //private 생성자
    private LISingletonTS() {
    }

    //인스턴스 리턴 (synchronized 키워드)
    public static synchronized LISingletonTS getInstance(){
        if (Objects.isNull(instance)) {
            instance = new LISingletonTS();
        }
        return instance;
    }
}