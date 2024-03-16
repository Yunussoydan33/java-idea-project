import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        // Asynchronously calculate the square of a number
        CompletableFuture<Integer> futureSquare = CompletableFuture.supplyAsync(() -> calculateSquare(5));

        // Asynchronously calculate the cube of a number
        CompletableFuture<Integer> futureCube = CompletableFuture.supplyAsync(() -> calculateCube(7));

        // Combining the results when both computations are complete
        CompletableFuture<Integer> combinedFuture = futureSquare.thenCombine(futureCube, (square, cube) -> square + cube);

        try {
            // Get the result when both computations are complete
            int result = combinedFuture.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // Method to calculate square of a number
    private static int calculateSquare(int num) {
        try {
            Thread.sleep(2000); // Simulating a long-running computation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num * num;
    }

    // Method to calculate cube of a number
    private static int calculateCube(int num) {
        try {
            Thread.sleep(3000); // Simulating a long-running computation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num * num * num;
    }
}