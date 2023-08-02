package aguideprog;
import java.util.*;

public class bingoCard {
    public static void main(String[] args) {
        int[][] card = generateCard();
        displayCard(card);
    }

    public static int[][] generateCard() {
        int[][] card = new int[5][5];
        Random rand = new Random();

        // Generate numbers for column B (1-15)
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(15) + 1;
            card[i][0] = num;
        }

        // Generate numbers for column I (16-30)
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(15) + 16;
            card[i][1] = num;
        }

        // Generate numbers for column N (31-45)
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 31; i <= 45; i++) {
            nums.add(i);
        }
        Collections.shuffle(nums);
        for (int i = 0; i < 4; i++) {
            card[i][2] = nums.get(i);
        }
        card[2][2] = 0; // Free space

        // Generate numbers for column G (46-60)
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(15) + 46;
            card[i][3] = num;
        }

        // Generate numbers for column O (61-75)
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(15) + 61;
            card[i][4] = num;
        }

        return card;
    }

    public static void displayCard(int[][] card) {
        System.out.println("B   I   N   G   O");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (card[i][j] == 0) {
                    System.out.print("FREE ");
                } else {
                    System.out.printf("%-4d", card[i][j]);
                }
            }
            System.out.println();
        }
    }
}
