class Solution {
     static int AddSquare(int num){
        int sum =0;
         while (num>0){
             int rem = num % 10;
             sum = sum + (rem * rem);
             num= num/10;
         }
         return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
         while (n!=1 && !visited.contains(n)){
          visited.add(n);
          n = AddSquare(n);
        }
        return n==1;
    }
}