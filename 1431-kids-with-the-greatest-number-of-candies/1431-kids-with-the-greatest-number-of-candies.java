class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length;
        ArrayList<Boolean> ans = new ArrayList<Boolean>(n);
        int max = 0;
        for(int i =0; i<n; i++){
            if(candies[i]>max)
                max=candies[i];
            candies[i] += extraCandies;
        }
        for(int i =0; i<n; i++){
            if(candies[i]>=max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}