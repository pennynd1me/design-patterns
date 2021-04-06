// 1. Eager Initialization (이른 초기화 방식)
public class EISingleton {
    //private static 으로 필드 선언
    private static EISingleton instance = new EISingleton();

    //private 생성자
    private EISingleton() {
    }

    //인스턴스 리턴
    public static EISingleton getInstance(){
        return instance;
    }
}