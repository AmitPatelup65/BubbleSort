public class Constructor {
    public static class cons{
        int age;
        int rol;
        cons(int a,int b){
            age=a;
            rol=b;
        }
    }
    public static void main(String[] args) {
        cons cons = new cons(23,22);
        System.out.println(cons.age);
        System.out.println(cons.rol);
    }
}
