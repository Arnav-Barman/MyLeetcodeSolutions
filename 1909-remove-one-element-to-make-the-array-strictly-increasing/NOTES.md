## array length = n
### make strictly increasing by removing one element at max
#### Find the number of peaks (nums[i]>nums[i+1] || nums[i]==nums[i+1])
- If there are no peaks, it is strictly increasing.
- If there are more than 1 peaks, no strictly increasing
- If there is only one peak, might be strictly increasing
  - If peak at 0 or n-2, will be strictly increasing
  - If peak in between, will be strictly increasing iff p-1 < p+1 || p < p+2
