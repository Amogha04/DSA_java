public class pattern_rec {
    public static void main(String[] args) {
        triangle1(4,0);
    }

     static void triangle1(int r, int c) {
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print(" x ");
            triangle1(r,c + 1);
        }else {
            System.out.println();
            triangle1(r - 1,0);
        }
    }

}
