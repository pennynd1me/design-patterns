package Singleton;

import java.util.Objects;

// 2. Lazy Initialization (늦은 초기화 방식)
public class LISingleton {
    //private static 으로 선언
    private static LISingleton instance;

    //private 생성자
    private LISingleton() {
    }

    //인스턴스 리턴
    public static LISingleton getInstance(){
        if (Objects.isNull(instance)) {
            instance = new LISingleton();
        }
        return instance;
    }
}