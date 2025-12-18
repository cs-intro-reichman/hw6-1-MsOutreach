import java.awt.Color;

public class Editor4 {
    
    public static void main (String[] args){
        
        String source = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] image = Runigram.read(source);
        Color[][] grayImage = Runigram.grayScaled(image);

        Runigram.setCanvas(grayImage);
        Runigram.display(grayImage);
         Runigram.morph(image, grayImage, n);
    }   
}
