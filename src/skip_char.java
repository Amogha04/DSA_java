public class skip_char {
    public static void main(String[] args) {
        String str = "baccadad";
        skipped_char_from_string("",str);
    }

    private static void skipped_char_from_string(String str,String s) {
        if(s.isEmpty()){
            System.out.println(str);
            return;
        }
        char c = s.charAt(0);
        if(c == 'a'){
            skipped_char_from_string(str,s.substring(1));
        }else skipped_char_from_string(str + c,s.substring(1));
    }
}
