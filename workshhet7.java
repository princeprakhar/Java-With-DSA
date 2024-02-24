import java.util.*;
class Main{  
 synchronized void sq(int n){
     System.out.println("Square: "+n*n);
   }  
}  
class MyThread1 extends Thread{  
Main m;  
MyThread1(Main m){  
this.m=m;  
}  
public void run(){  
m.sq(5);  
}  
  
}  
class MyThread2 extends Thread{  
Main m;  
MyThread2(Main m){  
this.m=m;  
}  
public void run(){  
m.sq(100);  
}  
}  
  
class wk7{  
public static void main(String args[]){  
Main obj = new Main();
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
} 
	