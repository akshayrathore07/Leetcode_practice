class Solution {

    public int getValue(char ch){
        if (ch == 'I'){
            return 1;
        }
        else if (ch == 'V'){
            return 5;
        }
        else if (ch == 'X'){
            return 10;
        }

        else if (ch == 'L'){
            return 50;
        }

        else if (ch == 'C'){
            return 100;
        }

        else if (ch == 'D'){
            return 500;
        }

        else {
            return 1000;
        }
    }
    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;

        for (int i=0; i<n; i++){
            char ch = s.charAt(i);

            if (i+1 < n && getValue(ch) < getValue(s.charAt(i+1))){
                sum = sum - getValue(ch);
            }
            else{
                sum = sum + getValue(ch);
            }
        }

        return sum;
    }
}