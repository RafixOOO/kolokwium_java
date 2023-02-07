/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.kolokwium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author rpezd
 */
class Zbior{
    private List myList = new ArrayList();
     Random generator = new Random();
    public void build(int a, int b){
        for(int i=0;i<=20;i++){
            int x=generator.nextInt(b)+a;
            myList.add(x);
        }
    }
    public void save() throws FileNotFoundException{
          
            PrintWriter saver = new PrintWriter(new FileOutputStream("D:\\Zadania\\Java\\kolokwium\\baza.txt"));
            for (int i = 0; i < myList.size(); i++) {
                saver.print(myList.get(i)+"; ");
                saver.print(myList.get(i+1)+"; ");
                saver.print(myList.get(i+1)+"\n");
                i=i+2;
                
            }
            saver.close();
            
    }
    public void load(){
        try {
            
            myList.clear();
            
            BufferedReader loader = new BufferedReader(new FileReader("D:\\Zadania\\Java\\kolokwium\\baza.txt"));
            String line = loader.readLine();
            while (line != null) {
                
                StringTokenizer st = new StringTokenizer(line, " ;,");                
                String liczba=st.nextToken();
                myList.add(Double.parseDouble(liczba));
                String liczba1=st.nextToken();
                myList.add(Double.parseDouble(liczba1));
                String liczba2=st.nextToken();
                myList.add(Double.parseDouble(liczba2));
                      
                line = loader.readLine();
            }
            
            loader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void print(){
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i)+", "+myList.get(i+1)+", "+myList.get(i+2)+", "+myList.get(i+3));
            i=i+3;
        }
    }
}
public class Zadanie3 {
    public static void main(String[] args) throws FileNotFoundException{
        Zbior array=new Zbior();
        array.build(1, 10);
        array.save();
        array.load();
        array.print();
    }
}
