package Multithreading.LabSession.WebScraper;
import java.util.concurrent.Callable;

public class ScrapURL implements Callable<Void> {
    private final String url;

    public ScrapURL(String url) {
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        // Simulating delay in scraping
        Thread.sleep(200);
        return null;
    }
}
