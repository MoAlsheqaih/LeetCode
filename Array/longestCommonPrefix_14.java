public class longestCommonPrefix_14 {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0) return prefix;
        else if (strs.length == 1) return strs[0];
        else {
            prefix = strs[0];
            for (int i = 1 ; i < strs.length ; i++){
                while (strs[i].indexOf(prefix) != 0){
                    prefix = prefix.substring(0,prefix.length()-1);
                }
            }
        }
        return prefix;
    }
}
