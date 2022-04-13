class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int s=0,e=n-1;
        while( s <= e ) {
            int m = s + ( ( e - s ) / 2 ) ;
            if(target < letters[m] ) {
                e = m - 1 ;
            }else{
                s = m + 1 ;
            }
        }
        return letters[s%n];
    }
}