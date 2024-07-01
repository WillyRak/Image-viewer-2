package ulpgc.imageviewer2.swing;

import ulpgc.imageviewer2.Image;
import ulpgc.imageviewer2.ImagePresenter;
import ulpgc.imageviewer2.mocks.MockImageLoader;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MockImageLoader().load();
    }
}

