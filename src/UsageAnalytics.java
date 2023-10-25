public class UsageAnalytics {

    private int visitsCount = 0;

    public UsageAnalytics() {
        visitsCount = 0;
    }

    public int countVisit() {
        return ++visitsCount;
    }
}


