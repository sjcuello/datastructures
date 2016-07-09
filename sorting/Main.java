import java.util.Scanner;
import java.util.LinkedList;
//import java.util.Arraylist;

public class Main{

  public static void main(String[] args) {
    System.out.println("Prueba de que andan las listas enlazadas");
    System.out.println("Creacion");
    int[] l ={4,3,5,2,1};
    /*int i=0;
    while(i<l.length){
      System.out.println(l[i]);
      i++;
    }*/
    Algorithms s= new Algorithms();
    System.out.println("insertionSort");

    s.insertionSort(l);
    for(int i=0;i<l.length;i++)
      System.out.println(l[i]);
  }	
}
