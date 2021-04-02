package Singleton;

// 1-1. Static Block Initialization
public class SBSingleton {
    //private static 으로 선언
    private static SBSingleton instance;

    //private 생성자
    private SBSingleton() {
    }
    //static 블럭 안에서 예외처리 가능
    static{
        try{
            //인스턴스 생성
            instance = new SBSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    //인스턴스 리턴
    public static SBSingleton getInstance() {
        return instance;
    }
}
