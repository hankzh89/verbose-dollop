package topcoder;

public class TruckLoads {
    public static int numTrucks(int numCrates, int loadSize) {
        if (numCrates <= loadSize ) {
            return 1;
        }
        int half = numCrates / 2;
        return numTrucks(half, loadSize) + numTrucks(numCrates - half, loadSize);
    }
}
