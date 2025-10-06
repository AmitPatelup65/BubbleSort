public class Constructor {
    public static class cons{
        int age;
        int rol;
        cons(int age,int b){
            System.out.println(age);
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        cons cons = new cons(23,22);
    }
}
