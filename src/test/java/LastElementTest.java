import com.company.EmptyExeption;
import com.company.LastElement;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastElementTest {
    @Test
    public void LastElement() throws EmptyExeption {
        List<String> words = new ArrayList<String>();
        Collections.addAll(words, "One", "Two", "Three");
        Assert.assertEquals("Three", LastElement.LastElement(words));
    }
}