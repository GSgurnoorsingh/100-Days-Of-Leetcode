class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int currentBottles=numBottles;

        while(numBottles>=numExchange){
            int totalBottles=numBottles/numExchange;
            int remBottles=numBottles%numExchange;
            currentBottles+=totalBottles;

            numBottles=totalBottles+remBottles;
        }

        return currentBottles;
    }
}
