class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
         int count=0;
        if(1>arr.length||arr.length>1000){return false;}
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){count=0;}
            else {count++;}
            if(count==3){break;}
        }

        if(count==3){return true;}
        else{return false;}
    }
}