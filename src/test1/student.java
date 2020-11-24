package test1;

public class student {
    private String name;
    private String sex;
    private int id;
    public student(String name,String sex,int id){
        System.out.println("student 构造函数");
        this.name = name;
        this.sex = sex;
        this.id = id;
    }
    public void findId(){
        System.out.println(this.name + "同学的id号为" + this.id);
    }
    public String toString(){//重写toString
        return name + " " + sex + " " + id;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getId(){
        return id;
    }
}
