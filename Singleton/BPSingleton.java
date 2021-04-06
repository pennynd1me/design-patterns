// 3. Bill Pugh Initialization on demand holder idiom (holder에 의한 초기화)
public class BPSingleton {
    //private 생성자
    private BPSingleton(){
    }

    //Nested Class (Holder Pattern), final 키워드
    private static class SingletonHolder {
        //클래스 로딩 시점에서 생성
        private static final BPSingleton INSTANCE = new BPSingleton();
    }

    //인스턴스 리턴
    public static BPSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
