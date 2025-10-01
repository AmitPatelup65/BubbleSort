public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=34;
        int c=55;
        if(a>b){
            if(a>c){
                System.out.println(a+" Is THe biggest NUmber");
            }

        } else if (b>c) {
            System.out.println(b+" Is the biggest Number");
        }
        else {
            System.out.print(c+" Is the biggest Number");
        }
    }
}
