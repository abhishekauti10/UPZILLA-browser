import java.util.Stack;


public class SolutionA {

    private final static Stack<String> history = new Stack<>();

    public static Boolean isBrowsingHistoryEmpty() {
        // Add CODE BELOW
        if (history.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String mostRecentlyVisitedSite() {
        // Add CODE BELOW
        if (!history.isEmpty()) {
            return history.peek();
        }
        return "Browsing history is empty.";    //it's temporary for extending the print condition.
    }

    public static void addSiteToHistory(String url) {
        // Add CODE BELOW
        if( url != null || !url.isEmpty() ){
            history.push(url);
        }
    }

    public static void goBackInTime(int n) {
        // Add CODE BELOW
        //If n is less then or equal to the size of the stack history and the stack history is not empty
        //remove n number of elements from the stack history
        //And check that 1<=n<=m, where m is the size of the stack history
        //And the stack history shouldn't be empty else do nothing

        if(n >= 1 && n <= history.size()){
            for(int i = 1; i < n; i++){
                history.pop();
            }
        }
        else {
            System.out.println("Browsing history size is less than input: " + history.size());   //it's temporary for extending the print condition.
        }
    }

    public static void printBrowsingHistory() {
        // Add CODE BELOW
        if(!history.isEmpty()){
            System.out.println(history);
        }
        else{
            System.out.println("Browsing history is empty");
        }
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }

}

/** Your code should have the following Output:
 * <p>
 * true
 * false
 * www.upgrad.com
 * www.yahoo.com
 * [www.google.co.in, www.facebook.com, www.yahoo.com]
 */
