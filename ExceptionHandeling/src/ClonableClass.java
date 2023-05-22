public class ClonableClass implements Cloneable {
    public String name;
    public int age;

    public ClonableClass(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
