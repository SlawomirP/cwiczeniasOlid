import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class BookRemakePrePOTest {
    // ze względu na użycie/zmiane pre i post fix, trzeba je dać na poczatku
    // prefix--> prefix + author, postfix --> jakis tekst + postfix



    @Test
    public void shouldReturnChangedPrefixPostfix () {
        // given, dajemy te obiekty bo na nich bedzie dzialal obiekt stworzony na remake
        BookAddPrefix newPrefix = new BookAddPrefix();
        BookAddPostfix newPostfix = new BookAddPostfix();
        // one ida do konstruktora
        BookRemakePrePo changedBook = new BookRemakePrePo(newPrefix, newPostfix);

        //when, tak ma wygladac konstrukcja i pod to uzupelniamy konstruktor a potem metode w klasie z metoda do podmianki pre i post
        String result = changedBook.addBookRemakePrePo("Mr", "James", "jr");

        // then
        assertThat(result).isEqualTo("Mr James jr");
    }

}