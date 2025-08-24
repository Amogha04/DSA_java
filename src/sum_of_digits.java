public class sum_of_digits {
    public static void main(String[] args) {
        int number = 13425;
        System.out.println(recurrsive_sumofdigits(number));
    }

    static int sumofdigits(int number) {
        int sum = 0;
        while (number > 0){
            int rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        return sum;
    }
    static int recurrsive_sumofdigits(int number){
        if(number == 0){
            return 0;
        }
        return (number % 10) + recurrsive_sumofdigits(number / 10);
    }
}
