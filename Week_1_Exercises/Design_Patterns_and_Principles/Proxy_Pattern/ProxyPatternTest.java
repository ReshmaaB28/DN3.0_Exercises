package Proxy_Pattern;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Create ProxyImage objects
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display images
        // The real image is loaded only when display() is called
        image1.display(); // Image is loaded and displayed
        image1.display(); // Image is displayed from cache
        image2.display(); // Image is loaded and displayed
    }
}

