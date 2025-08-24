import java.util.ArrayList;

public class DIce {
    public static void main(String[] args) {
        System.out.println(sumDice("",4));
    }
    static ArrayList<String> sumDice(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            result.addAll(sumDice(p + i,target - i));
        }
        return result;
    }
}
