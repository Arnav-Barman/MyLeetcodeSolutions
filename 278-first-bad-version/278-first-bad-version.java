/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1;
        while(s<n){
            int m = s + (n-s)/2;
            if(isBadVersion(m) == false)
                s = m+1;
            else
                n = m;
        }
        return s;
    }
}