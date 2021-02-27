package src;

public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.sumOfMultiples(10));
    }

    public int sumOfMultiples(int n){
        int sum = 0;
        for (int i = 0; i < n; i++){
            if ((i % 3 == 0) || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
