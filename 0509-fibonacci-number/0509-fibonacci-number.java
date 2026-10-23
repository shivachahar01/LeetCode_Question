class Solution {
    public int fib(int n) {
       return feb(n); 
    }
    static int feb(int a){
        if(a<=1){
            return a;
        }
        return feb(a-1)+feb(a-2);
    }
}