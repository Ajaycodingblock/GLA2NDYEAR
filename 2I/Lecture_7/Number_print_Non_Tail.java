

public class Number_print_Non_Tail {


    public static void fun(int n)
    {
        if(n==0)
        {
        return; 
        }
        fun(n-1);
        System.out.print(n + " ");


    }
    public static void main(String[] args) {
        fun(3);
    }
}
