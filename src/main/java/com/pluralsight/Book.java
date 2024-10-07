package com.pluralsight;

public class Book {
    public class Book{
        private int bookId;
        private String bookIsbn;
        private String bookTitle;
        private boolean isCheckedOut;
        private String checkedOutTo;

        public Book(int bookId, String bookIsbn, String bookTitle, boolean isCheckedOut, String checkedOutTo);
          this.bookId = bookId;
          this.bookIsbn = bookIsbn;
          this.bookTitle = bookTitle;
          this.isCheckedOut = true;
    }
    public int getBookId() {
        return bookId;
    }

    public String getbookTitle() {
        return bookTitle;
    }
    public boolean isCheckedout(){
        return isCheckedout;
    }
    public void checkedOut
    isCheckedout = true;

    public void returnBook() {
        isCheckedOut = false;

        public String checkedOutTo(){
            return checkedOutTo;
        }

        public String toString(){
            return "Book{" +
                    "bookId=" + bookId + ", bookIsbn=" + bookIsbn + '\'' + ", bookTitle='" + (isCheckedout ? "(NotCheckedOut)" : "(Available)" );

        }
    }
}