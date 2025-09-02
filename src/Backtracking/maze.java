package Backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(countDiagonal(3,3));
        System.out.println(pathDiagonal("",3,3));
    }
    static int count(int r ,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r - 1,c);
        int right = count(r ,c - 1);

        return left + right;
    }
    static ArrayList<String> path(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> paths = new ArrayList<>();
        if(r > 1){
            paths.addAll(path(p + 'D',r - 1,c));
        }
        if(c > 1){
            paths.addAll(path(p + 'R',r ,c - 1));
        }
        return paths;
    }
    static int countDiagonal(int r ,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = countDiagonal(r - 1,c);
        int mid = countDiagonal(r - 1,c - 1);
        int right = countDiagonal(r ,c - 1);

        return left + mid + right;
    }
    static ArrayList<String> pathDiagonal(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> paths = new ArrayList<>();
        if(r > 1){
            paths.addAll(pathDiagonal(p + 'D',r - 1,c));
        }
        if(r > 1 &&  c > 1){
            paths.addAll(pathDiagonal(p + 'M',r - 1,c - 1));
        }
        if(c > 1){
            paths.addAll(pathDiagonal(p + 'R',r ,c - 1));
        }
        return paths;
    }
}
