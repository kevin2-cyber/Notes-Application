package notes.digerati.scribble.data;

public class CardModel {

    private String title;
    private String date;
    private int color;

    public CardModel(String title, String date, int color) {
        this.title = title;
        this.date = date;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
