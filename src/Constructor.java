public class Constructor {
    public static class cons{
        int age;
        int rol;
        cons(int a,int b){
            age=a;
            rol=b;
        }
        void print(){
            System.out.println(age);
            System.out.println(rol);
        }
    }
    public static void main(String[] args) {
        cons cons = new cons(23,22);
        cons cons1=new cons(45,32);
       cons.print();
       cons1.print();
    }
}
