package maharishi.bitwise_and_numbers_system;

import java.util.Arrays;

class FlippingImage {
    public static  int[][] flipAndInvertImage(int[][] image) {
        for (int[] row: image)  {
            int midPoint = (image[0].length + 1) / 2;
            for (int i = 0; i < midPoint; i++) {
                // flip image by reversing elements
                 int temp =  row[i] ^1;
                 row[i] = row[image[0].length -i -1] ^ 1;
                 row[image[0].length -i -1] = temp;
            }

        }
        return image;
        
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flipped = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(flipped));
    }
}