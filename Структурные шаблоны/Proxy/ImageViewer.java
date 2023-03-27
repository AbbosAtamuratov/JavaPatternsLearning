import img.*;

public class ImageViewer {
    public static void main(String[] args) {
        Image img  =  new ProxyImage("chonky_image.png");

        // При первом вызове т.к. реальная картинка не загружена, будет вызван
        // метод загрузки, а потом уже показ
        img.display();

        // При втором вызове, т.к. картинка уже загружена, будет вызван только показ
        // вместо многократной загрузки с диска при каждом обращении
        img.display();
    }
}
