import com.company.EmptyExeption;
import com.company.Split;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitTest {
    @Test
    public void Split() throws EmptyExeption {
        List<String> words = new ArrayList<String>();
        Collections.addAll(words, "One,Two,Three");
        List<String> test = new ArrayList<String>();
        Collections.addAll(test, "One", "Two", "Three");
        Assert.assertEquals(test, Split.Split(words));
    }
}