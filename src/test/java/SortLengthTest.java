import com.company.EmptyExeption;
import com.company.SortLength;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLengthTest {
    @Test
    public void SortLength() throws EmptyExeption {
        List<String> words = new ArrayList<String>();
        Collections.addAll(words, "Teeest", "Test", "Teest");
        List<String> test = new ArrayList<String>();
        Collections.addAll(test, "Test", "Teest", "Teeest");
        Assert.assertEquals(test, SortLength.SortLength(words));
    }
}
