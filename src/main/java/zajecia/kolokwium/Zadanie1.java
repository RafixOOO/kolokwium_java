/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.kolokwium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author rpezd
 */
public class Zadanie1 extends JFrame implements ActionListener {
    JButton button,bWyjscie;
    JLabel lWyswietl,lWyswiet2;
    static double wynik = 0;
    static String k;
    public Zadanie1(){
        setSize(300,200);
        setTitle("Kolokwium");
        setLayout(null);
        
        button = new JButton("Wyswietl wynik");
        button.setBounds(50,50,100,20);
        add(button);
        button.addActionListener(this);
       
        lWyswietl = new JLabel("Wynik:");
        lWyswietl.setBounds(50, 100, 200, 20);
        add(lWyswietl);
        
        lWyswiet2 = new JLabel("liczby:");
        lWyswiet2.setBounds(50, 80, 200, 20);
        add(lWyswiet2);
    }
    public static void main(String[] args){
        Zadanie1 okno = new Zadanie1();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        Scanner input = new Scanner(System.in);
        boolean x = false;
        int[] tablica = new int[100];
        int i=0;
        while(x==false){ 
            System.out.println("Podaj liczbę");
            int liczba = input.nextInt();
            tablica[i]=liczba;
            i++;
            if(liczba==0){
                x=true;
            }
        }
        
        int c =0;
        for(int j =0; j<=i;j++){
            if(tablica[j]%2!=0){
                wynik=wynik+tablica[j];
                c++;
            }
            
        }
        for(int j =0; j<=i;j++){
            if(tablica[j]%2!=0 && tablica[j]!=0){
                k=tablica[j]+", "+k;
            }
        }
        wynik=wynik/c;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object źródło = e.getSource();
        if(źródło==button){
            String w = ""+wynik;
           lWyswietl.setText(w);
           lWyswiet2.setText(k);
           
        }
        else if(źródło==bWyjscie){
            dispose();
        }
        
    }
}
