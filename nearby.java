
import java.util.ArrayList;
import java.util.List;

class Nearby {

    public static List<Integer> getNearbyElements(int x, int y, int step) {
        int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }};
        int[] elements = new int[x];
        elements = multi[x];
        List<Integer> result = new ArrayList<Integer>();
        for (int i = y-step; i<y; i++) { 
            if (i >= 0) {
                result.add(elements[i]);
            }
        }
        for (int i = y+1; i<y+step+1; i++) { 
            if (i < elements.length) {
                result.add(elements[i]);
                }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNearbyElements(0, 2, 2));
        System.out.println(getNearbyElements(1, 0, 1));
        System.out.println(getNearbyElements(1, 3, 5));
    }
}
