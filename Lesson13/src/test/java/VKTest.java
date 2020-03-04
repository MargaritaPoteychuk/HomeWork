import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class VKTest {
    VK vk = new VK();

    @Test
    public void makePost() throws IOException, URISyntaxException {
        String actual = vk.post();
        Assert.assertTrue(actual.matches("\\d+"));
        vk.editPost();
        String actual2 = vk.getPost();
        Assert.assertTrue(actual2.contains("test message2222"));
        String actual3 = vk.deletePost();
        Assert.assertTrue(actual3.contains("1"));
    }





}
