package solution.find_increasing_characters;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        // Chuyển chuỗi sang mảng ASCII
        int n = input.length();
        int[] ascii = new int[n];
        for (int i = 0; i < input.length(); i++) {
            ascii[i] = (int) input.charAt(i);
        }

        // Mảng dp[i] = độ dài LIS kết thúc tại i
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        // Mảng trace dùng để truy ngược chuỗi
        int[] trace = new int[n];
        Arrays.fill(trace, -1);

        // Tính LIS
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (ascii[j] < ascii[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    trace[i] = j;
                }
            }
        }

        // Tìm vị trí có LIS dài nhất
        int maxdp = dp[0];
        int indexLast = 0;
        for (int i = 0; i < n; i++) {
            if (maxdp < dp[i]) {
                maxdp = dp[i];
                indexLast = i;
            }
        }

        // Truy ngược để lấy chuỗi LIS
        StringBuilder result = new StringBuilder();
        while (indexLast != -1) {
            char item = (char) ascii[indexLast];
            result.append(item);
            indexLast = trace[indexLast];
        }

        result.reverse();


        // In kết quả
        System.out.println("Chuỗi tăng dần dài nhất theo ASCII: " + result);
    }

    public static String findIncreasingCharacters(String s) {

        for (int i = 0; i < s.length(); i++) {

        }
        return "";
    }
}
