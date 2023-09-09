package pl.designs.structural.composite;

public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public File[] getFiles() {
        return new File[0];
    }

    @Override
    public boolean removeFile(File file) {
        return false;
    }
}
