package QueNo2;

class Book  {
    private int ISBN;
    private String BookTitle;
    private int numberOfPages;
    private int count;

    public Book(int ISBN, String BookTitle, int numberOfPages, int count) {
        this.ISBN = ISBN;
        this.BookTitle = BookTitle;
        this.numberOfPages = numberOfPages;
        this.count = count;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + BookTitle + ", Pages: " + numberOfPages + ", Count: " + count;
    }


    public int compareTo(Book myBook) {
        if (this.numberOfPages > myBook.numberOfPages) {
            return 1;
        } else if (this.numberOfPages == myBook.numberOfPages) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public int getCount(){
        return count;
    }
}
