

public class Book implements Comparable<Book> {
    String nameBook;
    String author;
    int pageCount;

    public Book(String nameBook, String author, int pageCount) {
        this.nameBook = nameBook;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getNameBook() {
        return nameBook;
    }


    public String getAuthor() {
        return author;
    }


    public int getPageCount() {
        return pageCount;
    }



    @Override
    public int compareTo(Book other) {
        if (author.compareTo(other.author) > 0) {
            return 1;
        }
        if (author.compareTo(other.author) < 0) {
            return -1;
        }
        return nameBook.compareTo(other.nameBook);

    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}



