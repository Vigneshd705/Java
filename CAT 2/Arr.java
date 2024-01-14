// import java.util.*; 
//  public class Arr{ 
//  public static void main(String args[]){ 
//  ArrayList<String> list=new ArrayList<String>();  
//    list.add("Subject 1");  
// list.add(" Subject 2");  
// list.add(" Subject 3");
// System.out.println(list);
// } 
//  }
import  java.util.*;    
public  class  Arr{    
  public  static  void  main(String  args[]){    
    ArrayList<String>  list=new  ArrayList<String>();//Creating  arraylist    
    list.add(" Subject 1");      
    list.add(" Subject 2");  
    list.add(" Subject 3");    
    Iterator  it=list.iterator();
    while(it.hasNext())
    {    System.out.println(it.next());      }      }    }