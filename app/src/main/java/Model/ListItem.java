package Model;

/**
 * Created by RaymondTsang on 12/23/17.
 */

public class ListItem {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListItem(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
