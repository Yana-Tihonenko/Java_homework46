import java.util.Comparator;

public class BookSortByPageCount implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o2.getPageCount() - o2.pageCount != 0) {
            return o2.getPageCount() - o2.pageCount;
        }
        return o1.getNameBook().compareTo(o2.getNameBook());
    }
}
