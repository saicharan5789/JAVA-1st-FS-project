package dev.charan.app;

import java.util.*;


public class AppOperations {
    
    Scanner scanner=new Scanner(System.in);
private void insertMethod(){
    String name = scanner.nextLine();
    int age=scanner.nextInt();
    AppItem a=new AppItem(name,age);
}
}