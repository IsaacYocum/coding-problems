package problems.leetcode._1791_1780;

public class _1791_FindCenterOfStarGraph {
    public static void main(String[] args) {
        int[][] edges = new int[3][2];
        edges[0][0] = 1;
        edges[0][1] = 2;
        edges[1][0] = 2;
        edges[1][1] = 3;
        edges[2][0] = 4;
        edges[2][1] = 2;

        int center = findCenter(edges);
        System.out.println(center);
    }

    // O(1), constant
    // O(1), no new space is allocated
    public static int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
            return edges[0][0];
        else
            return edges[0][1];
    }
}
