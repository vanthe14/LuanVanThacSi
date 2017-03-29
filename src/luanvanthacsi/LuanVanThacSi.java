/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luanvanthacsi;

import JVnSegmenter.Dictionary;
import JVnSegmenter.FeatureGen;
import JVnSegmenter.JVnSegmenter;
import JVnSegmenter.Maps;
import JVnSegmenter.Model;
import JVnSegmenter.Option;
import JVnSegmenter.TaggingInputData;
import JVnSegmenter.Viterbi;
import java.io.*;
import java.nio.file.Paths;

/**
 *
 * @author VanThe
 */
public class LuanVanThacSi {

    /**
     * @param args the command line arguments
     */
      
/*main method for using this tool from command line
 */        
    public static void main(String[] args){
      JVnSegmenter jvnSegmenter=new JVnSegmenter();
      String current = Paths.get("models").toAbsolutePath().toString();
        System.out.println(current);
        String[] argss = new String[4];
        argss[0]="-modeldir";
        argss[1]=Paths.get("models").toAbsolutePath().toString();
        argss[2]="-inputfile";
        argss[3]=Paths.get("input.txt").toAbsolutePath().toString();
      jvnSegmenter.main(argss);
     // jvnSegmenter.wordSegment("inputfile");
        //System.out.println(a);
    } // end of the main method
    
 }
