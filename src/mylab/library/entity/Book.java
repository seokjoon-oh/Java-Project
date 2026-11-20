
package mylab.library.entity;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private int publishYear;
    private boolean isAvailable;

    // 기본 생성자
    public Book() {
        this.isAvailable = true;
    }

    // 매개변수가 있는 생성자
    public Book(String title, String author,
                String isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.isAvailable = true;
    }

    // Getter / Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // 도서 대출
    public boolean checkOut() {
        if (!isAvailable) {
            return false;
        }

        isAvailable = false;
        return true;
    }

    // 도서 반납
    public void returnBook() {
        isAvailable = true;
    }

    // 도서 정보 출력
    @Override
    public String toString() {
        String status = isAvailable ? "가능" : "대출 중";

        return "책 제목: " + title
                + "\t저자: " + author
                + "\tISBN: " + isbn
                + "\t출판년도: " + publishYear
                + "\t대출 가능 여부: " + status;
    }
}
