import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookAddPrefixTest {

    @Test

    public void shouldAddCorrectlyPrefix () {
        //given
        BookAddPrefix prefix = new BookAddPrefix ();

        // when
        String result = prefix.addPrefixToAuthor("Mr", "Kowalski");

        // then
        assertThat(result).isEqualTo("Mr Kowalski");

    }

}