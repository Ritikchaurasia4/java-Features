class person{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class encapsulation{
    public static void main(String[]args)
    {
        person per = new person();
        per.setName("Ritik");
        per.setAge(21);
        System.out.println("Name :"+per.getName());
        System.out.print("Age: "+per.getAge());
    }
}