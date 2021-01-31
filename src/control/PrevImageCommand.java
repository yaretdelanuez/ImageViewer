
package control;

import java.util.List;
import model.Image;
import view.ImageDisplay;

public class PrevImageCommand implements Command{
    private final List<Image> images;
    private final ImageDisplay imageDisplay;

    public PrevImageCommand(List<Image> images, ImageDisplay imageDisplay) {
        this.images = images;
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public void execute() {
        imageDisplay.display(prev());
    }

    private Image prev() {
        int index = images.indexOf(imageDisplay.currentImage());
        return images.get((index-1+images.size()) % images.size());
        /**
         * size = 4
         * index = 0
         * 0 - 1 + 4 % 4 = 3 
         **/
    }
}
