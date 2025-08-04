public class FizzBuzz {
    public static String getFizzBuzz (int number) {

        if (number <= 0 || number >= 100) return "không hợp lệ";

        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0){
            return "Buzz";
        } else {
            return readNumber(number);
        }
    }

    public static String readNumber (int number) {
        String result;
        int dozen = 0;
        if(number > 20) {
            dozen = number / 10;
            number = number % 10;
        }
        switch (dozen) {
            case 2: result = "Twenty "; break;
            case 3: result = "Thirty "; break;
            case 4: result = "Forty "; break;
            case 5: result = "Fifty "; break;
            case 6: result = "Sixty "; break;
            case 7: result = "Seventy "; break;
            case 8: result = "Eighty "; break;
            case 9: result = "Ninety "; break;
            default:
                result = "";
        }

        switch (number){
            case 1: result += "One"; break;
            case 2: result += "Two"; break;
            case 3: result += "Three"; break;
            case 4: result += "Four"; break;
            case 5: result += "Five"; break;
            case 6: result += "Six"; break;
            case 7: result += "Seven"; break;
            case 8: result += "Eight"; break;
            case 9: result += "Nine"; break;
            case 10: result += "Ten"; break;
            case 11: result += "Eleven"; break;
            case 12: result += "Twelve"; break;
            case 13: result += "Thirteen"; break;
            case 14: result += "Fourteen"; break;
            case 15: result += "Fifteen"; break;
            case 16: result += "Sixteen"; break;
            case 17: result += "Seventeen"; break;
            case 18: result += "Eighteen"; break;
            case 19: result += "Nineteen"; break;
        }

        return result;
    }

}
