/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentpro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Abu Yasser
 */
public class StudentPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        
        Student[] st = {new ItStudent(1,"A","AA",99,85,89),
        new ItStudent(1,"B","bb",87,75,99),
        new ItStudent(1,"C","cc",67,88,89),new ArtStudent(1,"D","DD",97,67,79),new ArtStudent(1,"E","EE",99,85,89)};
        Student.sort(st);
        for(Student s : st){
            System.out.println(s);
    }
        PrintWriter output = new PrintWriter(new File("src/StudentPro/std.data"));
        for(Student s : st){
            output.println(s);
        }
        output.close();
        
  
}}
