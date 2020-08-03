class Display {
    public static void main(String[] args) {
        String result = Question6();
        System.out.println(result);

    }

    private static boolean Question5(String string) {
        
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return Question5(string.substring(1, string.length() - 1));
        }
        return false;            
    }

    private static int Question4(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return (3 * Question4(n - 1) + 2);
    }

    private static String Question6 () {
        String result = "";
        result += "recurcive code that is simple where one variable is manupulated each time. ";
        result += "get rid od recucive call and introduce for loop. ";
        result += "dosent eat up memory in runtime stack. much faster using loop.";
        return result;
    }

    private static String Question7 () {
        String result = "";
        result += "Starts at first element as the 'current' and checks for something smaller in the array. ";
        result += "if found, swaps it with the current elemnt and movesd the current elemnt forward. ";
        result += "dosent eat up memory in runtime stack. much faster using loop.";
        return result;
    }

}