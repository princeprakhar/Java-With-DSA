package Dsa_by_coding_ninjas;

import java.util.*;

public class webPages {
    public static int findMinClicks(int N, int[][] pages, int start, int end) {

    boolean[] visited = new boolean[N + 1];
    Queue<Map.Entry<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(start, 0));

        while (!queue.isEmpty()) {
        Map.Entry<Integer, Integer> currentPair = queue.poll();
        int currentPage = currentPair.getKey();
        int clicks = currentPair.getValue();

        visited[currentPage] = true;

        if (currentPage == end) {
            return clicks;
        }

        for (int linkedPage : pages[currentPage]) {
            if (!visited[linkedPage]) {
                queue.add(new AbstractMap.SimpleEntry<>(linkedPage, clicks + 1));
            }
        }
    }

        return -1;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] pages = new int[N + 1][];
        for (int i = 1; i <= N; i++)
            pages[i] = Arrays.stream(args[i + 1].split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = scan.nextInt();
        int end = scan.nextInt();

        int result = findMinClicks(N, pages, start, end);
        System.out.println(result);
    }
}