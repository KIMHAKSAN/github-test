package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // 1. 속성
    private List<Book> books; // 컬렉션 <= ArrayList
    // 2. 생성자(조립설명서)
    public Library(){
        books = new ArrayList<>();
    }
    // 3. 기능
    // 도서관에 책 추가
    public void addBook(Book book){
        books.add(book);
    }
    // 도서관에서 책 제거
    public void removeBook(Book book){
        books.remove(book);
    }
    // 도서광네서 책 이름으로 검색
    public Book searchByTitle(String title){
        for (Book book : books){
            String foundTitle = book.getTitle();
            if(foundTitle.equals(title)){
                return book;
            }
        }
        return null;
    }
}
