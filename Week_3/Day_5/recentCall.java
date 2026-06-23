import java.util.ArrayDeque;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> pingQueue;

    public RecentCounter() {
        pingQueue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        pingQueue.offer(t);
        int cutoffTime = t - 3000;
        
        // Remove pings that are older than the 3000ms window
        while (!pingQueue.isEmpty() && pingQueue.peek() < cutoffTime) {
            pingQueue.poll();
        }
        
        return pingQueue.size();
    }
}
