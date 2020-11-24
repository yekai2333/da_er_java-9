package test1;

public class classMate {
    public static void main(String[] args) {
        Zzr s = new Zzr("大宝","男",114514,90);
        student b = new Zzr("二宝","女",1919810,94);
        System.out.print("使用Zzr的引用调用findId");
        s.findId();
        System.out.print("\n使用student的引用调用findId");
        b.findId();
//        System.out.print("\n使用Zzr的引用调用findSex");
//        b.findSex();
    }
}
