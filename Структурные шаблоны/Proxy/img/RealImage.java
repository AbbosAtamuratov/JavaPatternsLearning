package img;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisc();
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void display() {
        System.out.println(String.format("Displaying %s", getFileName()));
    }

    private void loadImageFromDisc(){
        System.out.println(String.format("Loading %s from disc...", getFileName()));
    }
}
