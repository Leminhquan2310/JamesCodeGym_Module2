package solution.find_inceasing_character_consecutive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        String inputString = scanner.nextLine();
//
//        Map<Integer, String> map = new HashMap<>();
//        for (int i = 0; i < inputString.length(); i++) {
//            map.put(i, "" + inputString.charAt(i));
//            StringBuilder nowStr = new StringBuilder();
//            nowStr.append(map.get(i));
//            for (int j = i + 1; j < inputString.length(); j++) {
//                if (nowStr.charAt(nowStr.length() - 1) < inputString.charAt(j)) {
//                    nowStr.append(inputString.charAt(j));
//                } else break;
//            }
//            map.put(i, nowStr.toString());
//        }
//
//        String max = "";
//        for (int i = 0; i < inputString.length(); i++) {
//            if (map.get(i).length() > max.length()) {
//                max = map.get(i);
//            }
//        }
//        System.out.println("Result: " + max);

        /*
            (14) O(n^2) => thuật toán có độ phức tạp O(n^2)
        */


        // Solution 2

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        String inputString = scanner.nextLine();
//
//        String maxLen = "";
//        StringBuilder tempMax = new StringBuilder();
//        tempMax.append(inputString.charAt(0));
//        for (int i = 1; i < inputString.length(); i++) {
//            if (inputString.charAt(i) >= inputString.charAt(i - 1)) {
//                tempMax.append(inputString.charAt(i));
//            } else {
//                tempMax.setLength(0);
//                tempMax.append(inputString.charAt(i));
//            }
//
//            if (tempMax.length() > maxLen.length()) {
//                maxLen = tempMax.toString();
//            }
//        }
//
//        System.out.println(maxLen);
        /*
               toàn bộ thuật toán O(n).
         */

        // Solution 3
        // tìm vị trí bắt đầu substring & số lượng substring
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        int start = 0;
        int maxLen = 1;
        int maxStart = 0;
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) <= inputString.charAt(i - 1)){
                start = i;
            }

            if (i - start + 1 > maxLen){
                maxLen = i - start + 1;
                maxStart = start;
            }
        }

        System.out.println("Result: " + inputString.substring(maxStart, maxStart + maxLen));

        // O(n)
    }
}
