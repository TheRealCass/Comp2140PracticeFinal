public class PracticeFinal{
        public static void main(String[] args) {
        System.out.println(question1() + "\n");
        System.out.println(question2() + "\n");
        System.out.println(question3() + "\n");
        System.out.println(question4(7) + "\n");
        System.out.println(question5("kayak") + "\n");
        System.out.println(question6() + "\n");
        System.out.println(question7a() + "\n");
        System.out.println(question7b() + "\n");
        System.out.println(question8a() + "\n");
        System.out.println(question8b() + "\n");
        System.out.println(question8c() + "\n");
        System.out.println(question9() + "\n");
        System.out.println(question10() + "\n");



    }

    private static boolean question5(String string) {
        
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return question5(string.substring(1, string.length() - 1));
        }
        return false;            
    }

    private static int question1() {
        return 65;
    }

    private static int question2() {
        return 6;
    }

    private static int question3() {
        return Integer.MIN_VALUE;
    }
    
    private static int question4(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return (3 * question4(n - 1) + 2);
    }

    private static String question6 () {
        String result = "A:";
        result += "recurcive code that is simple where one variable is manupulated each time. ";
        result += "get rid od recucive call and introduce for loop. ";
        result += "dosent eat up memory in runtime stack. much faster using loop.";
        return result;
    }

    private static String question7a () {
        String result = "A:";
        result += "Starts at first element as the 'current' and checks for something smaller in the array. ";
        result += "if found, swaps it with the current elemnt and moves the current elemnt forward. ";
        result += "dosent eat up memory in runtime stack. much faster using loop.";
        return result;
    }

    private static String question7b () {
        String result = "A: ";
        result += "6 5 4 8 9 7 1\n";
        result += "1 5 4 8 9 7 6\n";
        result += "1 4 5 8 9 7 6\n";
        result += "1 4 5 8 9 7 6\n";
        result += "1 4 5 6 9 7 8\n";
        result += "1 4 5 6 7 9 8\n";
        result += "1 4 5 6 7 8 9";
        return result;
    }

    private static String question8a () {
        //learn shell short & write it down
        return null;
    }

    private static String question8b () {
        //learn shell short
        return null;
    }

    private static String question8c () {
        //learn diffrence between shell short & insertion short
        return null;
    }

    private static String question9 () {
        String result = "A: ";
        result += "475 215 441 224 421 175 115 124 021 275\n";
        result += "check the first digit from the right, and use counting sort to arrange them.\n";
        result += "441 421 021 224 124 475 214 175 115 275\n";
        result += "checking the middle number and using counting sort to arragnge them\n";
        result += "215 115 421 021 024 124 441 475 175 275\n";
        result += "checking the first digit from the left and using counting sort to arragnge them\n";
        result += "021 024 115 124 175 215 275 421 441 475";
        return result;
    }

    private static String question10 () {
        String result = "A: ";
        result += "8 6 5 9 10 2\t";
        result += "curr: 8. newMin(look from the begeining + 0 to end of array): 2. Swap curr & newMin. Move curr forward\n";
        result += "2 6 5 9 10 8\t";
        result += "curr: 6. newMin(look from the begeining + 1 to end of array): 5. Swap curr & newMin. Move curr forward\n";
        result += "2 5 6 9 10 8\t";
        result += "curr: 6. newMin(look from the begeining + 2 to end of array): 6. Swap curr and newMin. Move curr forward\n";
        result += "2 5 6 9 10 8\t";
        result += "curr: 9. newMin(look from the begeining + 3 to end of array): 8. Swap curr and newMin. Move curr forward\n";
        result += "2 5 6 8 10 9\t";
        result += "curr: 10. newMin(look from the begeining + 4 to end of array): 8. Swap curr and newMin. Move curr forward\n";
        result += "2 5 6 8 9 10";
        return result;
    }
}