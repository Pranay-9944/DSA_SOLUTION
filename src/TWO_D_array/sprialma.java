package TWO_D_array;

public class sprialma {

    public static void spiralMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        while (left <= right && top <= bottom) {

            // Top row (left -> right)
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            // Right column (top -> bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            // Bottom row (right -> left)
            if (top == bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            // Left column (bottom -> top)
            if (left == right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        spiralMatrix(mat);
    }
}