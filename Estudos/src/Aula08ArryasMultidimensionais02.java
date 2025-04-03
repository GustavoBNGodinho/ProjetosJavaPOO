public class Aula08ArryasMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[2][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0, 0}, {0, 1, 2}, {0, 1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
