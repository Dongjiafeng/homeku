package com.lanou3g.study;

import org.junit.Test;

import java.io.*;

public class SerializableDemo {
    @Test
    public void write() throws IOException {
        Pet pet = new Pet("雪耐瑞","male");

        FileOutputStream fs = new FileOutputStream("src/pet.out");

        ObjectOutputStream os  = new ObjectOutputStream(fs);

        os.writeObject(pet);

        os.flush();

        os.close();

    }
}
