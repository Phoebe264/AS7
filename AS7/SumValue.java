
public class SumValue extends Thread {
    
    public static void generateRandomArray(int[] arr){
        for (int a = 0; a < arr.length; a++) {
            arr[a] = (int) ((Math.random() * (1000 - 0)) + 0);
        }
    }
    
    static long sum(int[] arr){
        long sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += arr[a];
        }
        return sum;
    }
    
    
    @Override
    public void run() {
        
    }
    
    public static void main(String[] args){
        
        
        Thread th1 = new Thread(() -> {
            int[] arr = new int[4000000];
            generateRandomArray(arr);
            long sum = sum(arr);
            System.out.println("Sum: "+sum);
        });
        
        Thread th2 = new Thread(() -> {
            int[] arr = new int[4000000];
            generateRandomArray(arr);
            long sum = sum(arr);
            System.out.println("Sum: "+sum);
        });
        
        Thread th3 = new Thread(() -> {
            int[] arr = new int[4000000];
            generateRandomArray(arr);
            long sum = sum(arr);
            System.out.println("Sum: "+sum);
        });
        
        Thread th4 = new Thread(() -> {
            int[] arr = new int[4000000];
            generateRandomArray(arr);
            long sum = sum(arr);
            System.out.println("Sum: "+sum);
        });
        
        
        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
    
}
