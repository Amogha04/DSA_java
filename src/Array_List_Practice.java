import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //2 d-ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialization , as list is empty we initialize the empty list with some random elements
        for (int i =0;i < 3;i++){
            list.add(new ArrayList<>());
        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
