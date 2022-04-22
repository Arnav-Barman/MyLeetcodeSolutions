## This method walks on edges of shrinking rectangle and turns right at every corner.
```java
public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> out = new ArrayList<Integer>();
    if (matrix.length == 0) {
        return out;
    }

    int[] pos= { 0, 0 };
    int[] edges = { matrix[0].length - 1, matrix.length - 1, 0, 0 };

    int i = 0;
    int direction = 1;
    while (direction * pos[i % 2] <= direction * edges[i]) {
        out.add(matrix[pos[1]][pos[0]]);
        if (pos[i % 2] == edges[i]) {
            i = (i + 1) % 4;
            direction = 1 - i / 2 * 2;
            edges[(i + 2) % 4] += direction;
        }
        pos[i % 2] += direction;
    }

    return out;        
}
```
