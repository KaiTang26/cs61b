public class HelloNumbers{

    public static int sum(int x){
        int sum = 0;
        while(x >= 0){
            sum = sum + x;
            x = x - 1;
        }
        return sum;
    }

    public static void main(String[] args){
    
        System.out.println("The answer is "+sum(9));
    }
}