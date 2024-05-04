public class ImageLoader {
    // Private static variable of the same class that is the only instance of the class
    private static ImageLoader instance;

    // Private constructor to prevent instantiation from other classes
    private ImageLoader() {}

    // Public static method that returns the singleton instance
    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }

    // Method to simulate image loading
    public String loadImage() {
        return "Loaded successfully.";
    }
}
