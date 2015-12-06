package com.ashok.batch.samples;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by ashokgudise on 12/5/15.
 */
public class InputFileGenerator {

    public static void main(String[] args) {

        try {
            List<String> lines = FileUtils.readLines(new File(InputFileGenerator.class.getClassLoader().getResource("testInputfile.txt").toURI()));

            for(String line: lines){
                System.out.println("Content: \t"+line+" subsctring:\t"+line.substring(0,15));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
