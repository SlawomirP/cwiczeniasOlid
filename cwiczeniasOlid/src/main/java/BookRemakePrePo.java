public class BookRemakePrePo {
    BookAddPrefix newPrefix;
    BookAddPostfix newPostfix;
    public BookRemakePrePo(BookAddPrefix newPrefix, BookAddPostfix newPostfix) {
    this.newPrefix = newPrefix;
    this.newPostfix = newPostfix;
    }

    public String addBookRemakePrePo(String prefix, String author, String postfix) {
        // najpierw skladamy prefixa --> prefix + author
        String forPrefix = newPrefix.addPrefixToAuthor(prefix, author);
        // potem do efektu polaczenia dodajemy postfixa
        return forPrefix + " " + postfix;
    }
}
