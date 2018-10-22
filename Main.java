import java.util.Arrays;

class Main {
    static final int size = 10000000;
    static final int numberOfTreads = 2;
    static final int h = size / numberOfTreads;

    public static void main(String[] args) {

        Main main = new Main();
        main.method_1();
        main.method_2();
    }

    private void method_1() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Затраченное время на выполненике процесса в одном потоке: " + (System.currentTimeMillis() - a) + " миллисекунд");
    }


    void method_2() {

        float[] arr = new float[size];
        float[][] array = new float[numberOfTreads][h];

        Arrays.fill(arr, 1);

        long start = System.currentTimeMillis();

        Thread[] threads = new Thread[numberOfTreads];

        for (int i = 0; i < numberOfTreads; i++) {
            System.arraycopy(arr, h * i, array[i], 0, h);
            threads[i] = new Thread(new Calculation(array[i]));
            threads[i].start();
        }
        try {
            for (int i = 0; i < numberOfTreads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numberOfTreads; i++) {
            System.arraycopy(array[i], 0, arr, h * i, h);
        }
        System.out.println("Затраченное время на выполненике в " + numberOfTreads + " потоках " + (System.currentTimeMillis() - start + " миллисекунд"));
    }

    class Calculation implements Runnable {
        private float[] array;
       // private int change;

        Calculation(float[] array) {

            this.array = array;
        }

        @Override
        public void run() {
            for (int i = 0; i < array.length; i++)
                array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
