package JavaApply3;

import java.util.Date;
import java.util.Objects;
import java.util.Date;


public class Book implements Cloneable, Comparable <Book> {
    private String title;
    private Date publishDate;
    private String comment;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDate, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
    }
    
    @Override
    public Book clone() {
        Book result = new Book();
        result.comment = this.comment;
        result.publishDate = this.publishDate;
        result.title = this.title;
        return result;
    }
    
    
    @Override
    public int compareTo(Book obj) {
        if (this.publishDate.after(obj.publishDate)) {
            return 1;
        }
        if (this.publishDate.before(obj.publishDate)) {
            return -1;
        }
        return 0;
    }
}
