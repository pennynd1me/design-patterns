public class Test {

//    EISingleton eiSingleton;
//    SBSingleton sbSingleton;

//    LISingleton liSingleton;
//    LISingletonTS liSingletonTS;
//    LISingletonDC liSingletonDC;

//    BPSingleton bpSingleton;

//    EnumSingleton enumSingleton;

    public static void main(String[] args) {
        //생성할 수 없음
//        EISingleton eiSingleton0 = new EISingleton();
        //인스턴스 메서드 호출
        EISingleton eiSingleton1 = EISingleton.getInstance();
        EISingleton eiSingleton2 = EISingleton.getInstance();

        System.out.println(eiSingleton1);
        System.out.println(eiSingleton2);

        System.out.println(eiSingleton1 == eiSingleton2);

        NotSingleton notSingleton1 = new NotSingleton();
        NotSingleton notSingleton2 = new NotSingleton();

        System.out.println(notSingleton1);
        System.out.println(notSingleton2);

        System.out.println(notSingleton1 == notSingleton2);
    }
}
