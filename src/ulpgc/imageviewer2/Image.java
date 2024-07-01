package ulpgc.imageviewer2;

public interface Image {
    String id();
    Image next();
    Image prev();
}
