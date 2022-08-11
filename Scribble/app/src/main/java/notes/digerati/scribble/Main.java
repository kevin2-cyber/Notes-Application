package notes.digerati.scribble;

public class Main {

    public static void main(String[] args) {

        System.out.println(bubbleSort(new int[]{4, 2, 1, 5, 3, 1}));

    }

    public static boolean bubbleSort(int[] a){

        boolean sorted = false;
        int temp;
        while (!sorted) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a [i-1]) {
                    temp = a[i];
                    a[i] = a[i +1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return sorted;
    }
}
