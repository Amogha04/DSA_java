public class No_of_zeroes {
    public static void main(String[] args) {
        int number = 9005604;
        System.out.println(recurrsive_count_zeroes(number,0));
    }

     static int count_zeroes(int number) {
        int count = 0;
        while (number > 0){
            int rem = number % 10;
            if(rem == 0){
                count++;
            }
            number = number / 10;
        }
        return count;
    }
    static int recurrsive_count_zeroes(int num , int count){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){
            return recurrsive_count_zeroes(num / 10,count + 1);
        }else return recurrsive_count_zeroes(num/10, count);
    }
}
