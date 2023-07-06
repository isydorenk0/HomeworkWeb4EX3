package Entity;

public class Mark {
    private long id;
    private String mark;

    public Mark(long id, String mark) {
        this.id = id;
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
