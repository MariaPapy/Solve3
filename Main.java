public class Main {
    public static void main(String[] args) {
        Author author = new Author("","","");
        Book book = new Book("","",null);
        author.setAuthoremail("doncova.111@yandex.ru");
        author.setAuthorname("Донцова");
        author.setAuthorgender("Женщина");
        book.setBookauthor(author);
        book.setBookyear("2001");
        book.setBooktitle("Крутые наследники");
        book.toString();
    }
}