import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000000);
        }
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        SelectionSort.selectionSort(arr);
        stopWatch.stop();

        System.out.println(" Thời gian sắp xếp cho 100.000 số là: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}