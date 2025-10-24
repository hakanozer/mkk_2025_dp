package com.works.services;

import com.works.composite.File;
import com.works.composite.FileSystemComponent;
import com.works.composite.Folder;
import com.works.entties.Customer;
import org.springframework.stereotype.Service;

@Service
public class FileSystemService {

    public long getAllSize() {
        FileSystemComponent root = setup();
        return root.getSize();
    }

    public FileSystemComponent setup() {
        Folder root = new Folder("root");
        File f1 = new File("1.jpg", 10);
        File f2 = new File("2.jpg", 20);

        Folder folder1 = new Folder("folder1");
        File f3 = new File("3.jpg", 30);
        File f4 = new File("4.jpg", 40);
        folder1.add(f3);
        folder1.add(f4);

        Folder folder2 = new Folder("folder2");
        File f5 = new File("5.jpg", 45);
        folder2.add(f5);
        folder1.add(folder2);

        root.add(f1);
        root.add(f2);
        root.add(folder1);

        Customer c1 = new Customer();
        c1.setId(10);
        c1.setName("Ali");

        Customer c2 = new Customer();
        c2.setId(10);
        c2.setName("Ali");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        if (c1 == c2) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        System.out.println("==================");
        String a = "Enes";
        String b = "Enes";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a == b) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        return root;
    }

}
