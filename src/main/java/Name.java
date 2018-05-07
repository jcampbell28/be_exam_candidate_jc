public class Name {
    private String first;
    private String middle;
    private String last;

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return this.middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

}
