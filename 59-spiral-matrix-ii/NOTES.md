## Approach 1: Traverse Layer by Layer in Spiral Form

### Intuition

If we try to build a pattern for a given nn, we observe that the pattern repeats after completing one circular traversal around the matrix. Let's call this one circular traversal as layer. We start traversing from the outer layer and move towards inner layers on every iteration.

![lc_img](https://leetcode.com/problems/spiral-matrix-ii/Figures/59/spiral_layers.png)

### Algorithm

Let's devise an algorithm for the spiral traversal:
- We can observe that, for any given n, the total number of layers is given by : floor( (n+1)/2 ) This works for both even and odd n. For example n=3,layer=2; n=6, layer=3;
- Also, for each layer, we traverse in at most 4 directions :
![img](https://leetcode.com/problems/spiral-matrix-ii/Figures/59/spiral_traverse.png)

In every direction, either row or column remains constant and other parameter changes (increments/decrements). 
- Direction 1: From top left corner to top right corner. 
  - The row remains constant as layer and column increments from layer to n-layer-1 
- Direction 2: From top right corner to the bottom right corner. 
  - The column remains constant as n-layer-1 and row increments from layer+1  to n-layer. 
- Direction 3: From bottom right corner to bottom left corner. 
  - The row remains constant as n-layer-1 and column decrements from n-layer-2 to layer. 
- Direction 4: From bottom right corner to top left corner. 
  - The column remains constant as layer and column decrements from n-layer-2 to layer+1. 

This process repeats (n + 1)/2 times until all layers are traversed. 

![img](https://leetcode.com/problems/spiral-matrix-ii/Figures/59/spiral_detailed.png)

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int cnt = 1;
        for (int layer = 0; layer < (n + 1) / 2; layer++) {
            // direction 1 - traverse from left to right
            for (int ptr = layer; ptr < n - layer; ptr++) {
                result[layer][ptr] = cnt++;
            }
            // direction 2 - traverse from top to bottom
            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
                result[ptr][n - layer - 1] = cnt++;
            }
            // direction 3 - traverse from right to left
            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
                result[n - layer - 1][n - ptr - 1] = cnt++;
            }
            // direction 4 - traverse from bottom to top
            for (int ptr = layer + 1; ptr < n - layer - 1; ptr++) {
                result[n - ptr - 1][layer] = cnt++;
            }
        }
        return result;
    }
}
```


![image](https://user-images.githubusercontent.com/86536812/164774351-3fb8f544-1845-4ef1-adab-1f44298db2a1.png)


![image](https://user-images.githubusercontent.com/86536812/164774365-6783cd25-d67c-41dd-8238-ad6c4a3c974e.png)

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int cnt = 1;
        int dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        int row = 0;
        int col = 0;
        while (cnt <= n * n) {
            result[row][col] = cnt++;
            int r = Math.floorMod(row + dir[d][0], n);
            int c = Math.floorMod(col + dir[d][1], n);

            // change direction if next cell is non zero
            if (result[r][c] != 0) d = (d + 1) % 4;

            row += dir[d][0];
            col += dir[d][1];
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/86536812/164774414-0b830798-8bed-4251-a5a9-1f8cbfbef9c4.png)
