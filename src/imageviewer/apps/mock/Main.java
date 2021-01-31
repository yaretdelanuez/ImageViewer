
package imageviewer.apps.mock;

import control.Command;
import control.ExitImageCommand;
import control.InitCommand;
import control.NextImageCommand;
import control.PrevImageCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Image;
import view.ImageDisplay;
import view.ImageLoader;


public class Main {
    
    private static Map<String, Command> initCommands(List<Image> images, ImageDisplay imageDisplay, ImageLoader imageLoader) {
        HashMap<String, Command> result = new HashMap<>();
        result.put("q", new ExitImageCommand());
        result.put("i", new InitCommand(imageLoader, images, imageDisplay));
        result.put("p", new PrevImageCommand(images, imageDisplay));
        result.put("n", new NextImageCommand(images, imageDisplay));
        result.put("Q", result.get("q"));
        result.put("P", result.get("p"));
        result.put("N", result.get("n"));
        return result;
    }    
}
