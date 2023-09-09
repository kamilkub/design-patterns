package pl.designs.structural.composite;

import java.util.ArrayList;

public class Directory extends File {

    private ArrayList<File> children = new ArrayList<>();

     public Directory(String name) {
         super(name);
     }

    @Override
    public void ls() {
        System.out.printf(getName());
        children.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    @Override
    public boolean removeFile(File file) {
        return children.remove(file);
    }

}
