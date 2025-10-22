package com.works.composite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Folder implements FileSystemComponent{

    private final String name;
    private final Set<FileSystemComponent> componentsSet = new HashSet<>();

    public Folder(String name) {
        this.name = name;
        System.out.println("Folder Name : " + name + "");
    }

    public void add(FileSystemComponent component) {
        componentsSet.add(component);
        componentsSet.add(component);
    }

    public void remove(FileSystemComponent component) {
        componentsSet.remove(component);
    }

    @Override
    public long getSize() {
        return componentsSet.stream().mapToLong(FileSystemComponent::getSize).sum();
    }
}
