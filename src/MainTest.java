import topcoder.CheckFunction;
import topcoder.CostOfDancing;

public class MainTest {
    public static void main(String[] args) {
        int[] test = {973, 793, 722, 573, 521, 568, 845, 674, 595, 310, 284, 794, 913, 93, 129, 758, 108, 433, 181, 163, 96, 932,
                703, 989, 884, 420, 615, 991, 364, 657, 421, 336, 801, 142, 908, 321, 709, 752, 346, 656, 413, 629, 801};
        int result = CostOfDancing.minimum(39, test);
        System.out.println("Result: " + result);
    }
}
