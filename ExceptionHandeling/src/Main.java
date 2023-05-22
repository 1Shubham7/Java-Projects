public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        ClonableClass shubham  = new ClonableClass("Shubham" , 19);
//        ClonableClass mahar = new ClonableClass(shubham);
        ClonableClass mahar = (ClonableClass) shubham.clone();
        System.out.println(mahar.name + " " + mahar.age);

    }

    static int divide(int c, int b) throws ArithmeticException{
        if (c==0){
            throw new ArithmeticException("Zero se divide mat kar");
        } return b/c;
    }

}