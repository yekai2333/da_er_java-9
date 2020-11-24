package test1;

public class Zzr extends student{
    private int math_s;
    public Zzr(String name, String sex, int id, int math_s){
        super(name,sex,id);
        setMath_s(math_s);
    }
    public void findId(){
        System.out.println("Zzr类的findId方法");
        System.out.println(getName() + "的高数成绩为 " + math_s);
    }
    public int getMath_s(){
        return math_s;
    }
    public void setMath_s(int newMath_s){
        math_s = newMath_s;
    }
    public void findSex(){
        System.out.println(getName() + "的性别为 " + getSex());
    }
}
