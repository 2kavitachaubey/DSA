import java.util.Random;
import java.util.Scanner;

public class ErrorControl {

    // Function to simulate sending frames
    static void sendFrames(String[] frames) {
        System.out.println("\n--- Sending Frames ---");
        for (int i = 0; i < frames.length; i++) {
            System.out.println("Frame " + (i + 1) + " sent: " + frames[i]);
        }
    }

    // Function to simulate receiving frames with possible errors
    static void receiveFrames(String[] frames) {
        System.out.println("\n--- Receiving Frames ---");
        Random rand = new Random();

        for (int i = 0; i < frames.length; i++) {
            // Randomly decide if the frame is received correctly or with an error
            boolean error = rand.nextBoolean();

            if (error) {
                System.out.println("Frame " + (i + 1) + " received with ERROR ❌");
                System.out.println("Requesting retransmission of frame " + (i + 1) + "...");
                System.out.println("Frame " + (i + 1) + " retransmitted successfully ✅");
            } else {
                System.out.println("Frame " + (i + 1) + " received successfully ✅");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Error Control Simulator (Data Link Layer) ===");
        System.out.print("Enter number of frames to send: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] frames = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for Frame " + (i + 1) + ": ");
            frames[i] = sc.nextLine();
        }

        sendFrames(frames);
        receiveFrames(frames);

        System.out.println("\nAll frames have been successfully transmitted using error control techniques.");
        System.out.println("Simulation Complete ✅");
        sc.close();
    }
}
