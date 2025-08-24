public class Patterns {
    // Two steps to solve any pattern question
    //1. There will be generally 2 loops,first one is for number of rows
    //2.Second loop is for how many cols does each row contain or what type of element is there
    //in each row
    //3.What do you need to print
    public static void main(String[] args) {
        pattern9(4);
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //For n = 4
        //*
        //* *
        //* * *
        //* * * *
    }
    static void pattern2(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1;j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //For n = 4
        //* * * *
        //* * * *
        //* * * *
        //* * * *
    }
    static void pattern3(int n){
        for(int i = 1;i <= n;i++){
            for (int j = n - i + 1; j >=1 ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //For n = 4
        //* * * *
        //* * *
        //* *
        //*
    }
    static void pattern4(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //For n = 4
        //1
        //1 2
        //1 2 3
        //1 2 3 4
    }
    static void pattern5(int n){
        for(int i = 0;i < 2 * n ;i++){
            int c = i > n ? 2 * n - i  : i;
            for(int j = 0;j < c;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //For n = 4
        //*
        //* *
        //* * *
        //* * * *
        //* * *
        //* *
        //*
    }
    static void pattern6(int n){
        for(int i = 0;i < 2 * n ;i++){
            int c = i > n ? 2 * n - i  : i;
            int spaces = n - c;
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for(int j = 0;j < c;j++){
                System.out.print("* ");
            }
            System.out.println();
            //For n = 4
            //   *
            //  * *
            // * * *
            //* * * *
            // * * *
            //  * *
            //   *
        }
    }
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
    //For n = 4
    //      1
    //    2 1 2
    //  3 2 1 2 3
    //4 3 2 1 2 3 4
    static void pattern8(int n){
        for (int i = 1; i <=2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
    //For n = 4
    //      1
    //    2 1 2
    //  3 2 1 2 3
    //4 3 2 1 2 3 4
    //  3 2 1 2 3
    //    2 1 2
    //      1
    static void pattern9(int n){
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0;j <= n;j++){
                int left = j;
                int up = i;
                int right = n - j;
                int down = n - i;
                int everyIndex1 = Math.min(left,right);
                int everyIndex2 = Math.min(up,down);
                int everyIndex = Math.min(everyIndex2,everyIndex1);
                System.out.print(everyIndex + " ");
            }
            System.out.println();
        }
    }
    //For n = 4
    //0 0 0 0 0 0 0 0 0
    //0 1 1 1 1 1 1 1 0
    //0 1 2 2 2 2 2 1 0
    //0 1 2 3 3 3 2 1 0
    //0 1 2 3 4 3 2 1 0
    //0 1 2 3 3 3 2 1 0
    //0 1 2 2 2 2 2 1 0
    //0 1 1 1 1 1 1 1 0
    //0 0 0 0 0 0 0 0 0
}

