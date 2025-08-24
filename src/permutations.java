import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        String str = "abc";
        //Permutations("",str);
        System.out.println(Permutations_arr("",str));
    }

    private static void Permutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            Permutations(f + ch + s,up.substring(1));
        }
    }
    static ArrayList<String> Permutations_arr(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(Permutations_arr(f + ch + s,up.substring(1)));
        }
        return ans;
    }
}
