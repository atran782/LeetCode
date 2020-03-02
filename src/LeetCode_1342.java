public class LeetCode_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfStepsWhile(123));
        System.out.println(numberOfStepsRecursion(123));
    }

    public static int numberOfStepsRecursion(int num) {
        if (num == 0) return 0;
        if (num % 2 == 0) return 1 + numberOfStepsRecursion(num / 2);
        return 1 + numberOfStepsRecursion(num -1);
    }

    public static int numberOfStepsWhile (int num) {
        int counter = 0;
        while(num != 0){
            if (num % 2 == 0){
                num = num/2;
            }
            else {
                num--;
            }
            counter++;
        }
        return counter;
    }
}
