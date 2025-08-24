public class reversal_of_a_number {
    public static void main(String[] args) {
        int number = 1264;
        System.out.println(reverse(number));
    }
    static int reverse(int number){
        int reverse = 0;
        while (number > 0){
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        return reverse;
    }

}
