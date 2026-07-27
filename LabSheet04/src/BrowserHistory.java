import java.util.LinkedList;

public class BrowserHistory {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<String> browserHistory = new LinkedList<String>();

        browserHistory.add("google.com");
        browserHistory.add("youtube.com");
        browserHistory.add("github.com");
        System.out.println(browserHistory);

        browserHistory.removeLast();
        System.out.println(browserHistory);

        browserHistory.add("shopee.com");
        browserHistory.add("wikipedia.org");
        browserHistory.add("claude.ai");
        System.out.println(browserHistory);

        browserHistory.remove(1);
        System.out.println(browserHistory);

        System.out.println("current page = " + browserHistory.getLast());

        System.out.println("Visited youtube.com = " + browserHistory.contains("youtube.com"));

        System.out.println("Go back to previous page = " + browserHistory.get(browserHistory.size() - 2));

        System.out.println("Go back to previous page again = " + browserHistory.get(browserHistory.size() - 3));

        browserHistory.clear();
        System.out.println(browserHistory);
    }

}