import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class BookAddPostfixTest {

    @Test
    public void shouldAddCorrectlyPostfix () {

        // given
        BookAddPostfix postfix = new BookAddPostfix ();

        // when
        String result = postfix.addPostfixToAuthor("Mike", "jr");

        // then
        assertThat(result).isEqualTo("Mike jr");
    }

}