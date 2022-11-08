package pt.estig.twdm.pdm.keep_pocket.database;

import java.util.List;

public class KPAPIResponse<C> {
    private int count;
    private String next;
    private String previous;
    private List<C> results;

    public KPAPIResponse(int count, String next, String previous, List<C> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<C> getResults() {
        return results;
    }
}
