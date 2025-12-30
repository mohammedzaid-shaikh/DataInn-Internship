// Store leaderboard scores sorted

package Week_2_Task_4;

import java.util.TreeSet;

public class LeaderBoardScores {
    public static void main(String[] args) {
        TreeSet<Integer> cricketScore = new TreeSet<>();

        cricketScore.add(150);
        cricketScore.add(200);
        cricketScore.add(150);
        cricketScore.add(300);
        cricketScore.add(350);

        System.out.println("\nLeaderboard Scores (Sorted):");

        for (Integer score : cricketScore.descendingSet()) {
            System.out.println("Score: " + score);
        }
    }
}
