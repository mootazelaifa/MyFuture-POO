import java.util.Scanner;
public class tableau{
public static void main(String[] args){
    double [] mylist = new double[10];
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("enter " + mylist.length + "values: ");
    for (int i = 0; i< mylist.length ; i++)
        mylist[i] = input.nextDouble();
    for (int i = 0; i< mylist.length ; i++)
        System.out.print(mylist[i] + " ");

    double [] mylist2 = new double[10];
    for (int i = 0; i< mylist2.length ; i++)
        mylist2[i] = Math.random() * 100;

    for (int i = 0; i< mylist2.length ; i++)
        System.out.print(mylist2[i] + " ");

    double total = 0;
    
}}