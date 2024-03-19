import java.util.UUID;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/01/24 15:47
 */
public class DownloadPicTest {
    public static void main(String[] args) {
        String url = "file:///C:/Users/K/Downloads/pexels-reya-kons-18455567.jpg";
        String path="/users/gaohanghang/download/";
        DownloadPicFromURL.downloadPicture(url,path + UUID.randomUUID() + ".jpg");
    }
}
