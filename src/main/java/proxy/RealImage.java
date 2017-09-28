package proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public String display() {
        String a = "Displaying " + fileName;
        System.out.println(a);
        return a;

    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }


    @Override
    public String getfileName() {
        return this.fileName;
    }

}