public class Day13ArryForeach {
    public static void main(String[] args) {
        int [] name ={10,20,30,40,50};
        int sum =0;

        for(int x : name){
            sum = sum + x;
            System.out.println(x);
        }
        System.out.println("sum is :"+sum);
    }
}
