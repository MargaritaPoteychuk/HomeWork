import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class VK {
    public String id;
    public String ownerId = "12825684";
    public String token = "75f7ab7357bed0e4e2c03262ae27addc115c4f7ed95604ccf9ea7169de58fbf5fab3ed1bd8911776598eb";
    public String vkV = "5.103";
    CloseableHttpClient client = HttpClientBuilder.create().build();

    public String post() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
        builder.setParameter("access_token", token)
                .setParameter("owner_id", ownerId)
                .setParameter("message", "test message111")
                .setParameter("v", vkV);
        HttpGet request = new HttpGet(builder.build());
        CloseableHttpResponse response = client.execute(request);
        id = EntityUtils.toString(response.getEntity()).replaceAll("\\D", "");
        return id;
    }

    public String editPost() throws URISyntaxException, IOException {
        URIBuilder builder2 = new URIBuilder("https://api.vk.com/method/wall.edit?");
        builder2.setParameter("access_token", token)
                .setParameter("owner_id", ownerId)
                .setParameter("post_id", id)
                .setParameter("message", "test message2222")
                .setParameter("v", vkV);
        HttpGet request2 = new HttpGet(builder2.build());
        CloseableHttpResponse response2 = client.execute(request2);
        return EntityUtils.toString(response2.getEntity());
    }

    public String getPost() throws URISyntaxException, IOException {
        URIBuilder builder2 = new URIBuilder("https://api.vk.com/method/wall.getById?");
        builder2.setParameter("access_token", token)
                .setParameter("posts", ownerId + "_" + id)
                .setParameter("v", vkV);
        HttpGet request2 = new HttpGet(builder2.build());
        CloseableHttpResponse response2 = client.execute(request2);
        return EntityUtils.toString(response2.getEntity());

    }

    public String deletePost() throws URISyntaxException, IOException {
        URIBuilder builder3 = new URIBuilder("https://api.vk.com/method/wall.delete?");
        builder3.setParameter("access_token", token)
                .setParameter("owner_id", ownerId)
                .setParameter("post_id", id)
                .setParameter("v", vkV);
        HttpGet request3 = new HttpGet(builder3.build());
        CloseableHttpResponse response3 = client.execute(request3);
        return EntityUtils.toString(response3.getEntity());
    }
}
