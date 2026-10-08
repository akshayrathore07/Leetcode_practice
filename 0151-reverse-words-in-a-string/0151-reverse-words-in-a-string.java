class Solution {
    public String reverseWords(String s) {
        String word = "";
        Stack<String> st = new Stack<>();
        s = s.trim();
        int length = s.length();
        int i=0;
        while(i<length){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(word.equals("")){
                    i++;
                }else{
                    st.push(word);
                    word = "";
                    i++;
                }
            }else{
                word += ch;
                i++;
            }
            
        }
        if(!word.equals("")){
            st.push(word);
        }
        String res = "";
        while(!st.isEmpty()){
            String stWord = st.pop();
            res = res +stWord +" ";
        }
        res = res.trim();
        return res;
    }
}