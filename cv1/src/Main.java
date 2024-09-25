public class Main {
    public static void main(String[] args) {
        Array arr = new Array(10);

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arr.add(i, 0);
            // arr.add(i);
        }
        long end = System.nanoTime();
        float dur = (end - start) / (float) 1000000;

        // System.out.println(arr);
        System.out.println(dur + " ms");
    }
}
