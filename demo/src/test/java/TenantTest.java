import com.XXXX.lcp.theadDemo.HtmlRequstRunner;

public class TenantTest {
    public static void main(String[] args) {
        HtmlRequstRunner htmlRequstRunner = new HtmlRequstRunner();

        //创建新线程，线程id不会出现重复
        for (int i = 0; i < 100; i++) {
            new Thread(htmlRequstRunner).start();
        }
    }
}
