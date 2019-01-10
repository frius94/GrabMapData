package tomtom;

public class Summary {
    private String query;
    private String queryType;
    private int queryTime;
    private int numResults;
    private int offset;
    private int totalResults;
    private int fuzzyLevel;

    public Summary(String query, String queryType, int queryTime, int numResults, int offset, int totalResults, int fuzzyLevel) {
        this.query = query;
        this.queryType = queryType;
        this.queryTime = queryTime;
        this.numResults = numResults;
        this.offset = offset;
        this.totalResults = totalResults;
        this.fuzzyLevel = fuzzyLevel;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public int getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(int queryTime) {
        this.queryTime = queryTime;
    }

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getFuzzyLevel() {
        return fuzzyLevel;
    }

    public void setFuzzyLevel(int fuzzyLevel) {
        this.fuzzyLevel = fuzzyLevel;
    }
}
