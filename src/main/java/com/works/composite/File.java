package com.works.composite;

public class File implements FileSystemComponent{

    private final String name;
    private final long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
        System.out.println("File Name : " + name + " Size : " + size + "");
    }

    @Override
    public long getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

}
