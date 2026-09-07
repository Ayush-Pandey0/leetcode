class Solution {
    public boolean isUgly(int n) {
       if(n<=0) return false;
       while(n%2==0) n/=2;
       while(n%3==0) n/=3;
       while(n%5==0) n/=5;
        return n==1;
    }
}

// public boolean isPrime(int n){
//         for(int i=4;i<=n/2;i++){
//             if(i==2||i==3||i==5) continue;
//             if(n%i==0) return false;
//         }
//         return true;
//     }
//     public boolean isUgly(int n) {
//         if(n<=2) return true;
//         for(int i=3;i<=n/2;i++){
//             if(n%i==0&&isPrime(i)){
//                 return false;
//             }
//         }
//         return true;
//     }