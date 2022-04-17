### A solution that optimises space in a better way.
```java
public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        //no need to handle cases like 1919 separately, 
        //just change 9 to 0 and if the number at digits[i-1] is not 9 then ++ it and return the solution, 
        //else keep 0'ing the 9's and if the whole array get changed to 0, 
        //then only create a new array to make its ans[0] =1 and rest digits 0. 
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}
```
