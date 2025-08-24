public class factorial {
    public static void main(String[] args) {
        int number = 8;
        System.out.println(factorial_of_num(number));
    }

    static int factorial_of_num(int number) {
        if(number <= 1){
            return 1;
        }
        return number * factorial_of_num(number - 1);
    }
}
