class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalWaitingTime = 0;
        int currentTime = 0;
        for (int[] customer : customers) {
            int arrival = customer[0];
            int time = customer[1];
            if (currentTime < arrival) {
                currentTime = arrival;
            }
            int finishTime = currentTime + time;
            int waitingTime = finishTime - arrival;
            totalWaitingTime += waitingTime;
            currentTime = finishTime;
        }
        double averageWaitingTime = totalWaitingTime / customers.length;
        return averageWaitingTime;
    }
}