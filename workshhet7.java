class Main7{
 synchronized void sq(int n){
     System.out.println("Square: "+n*n);
   }  
}  
class MyThread1 extends Thread{  
main m;
MyThread1(main m){
this.m=m;  
}  
public void run(){  
m.sq(5);  
}  
  
}  
class MyThread2 extends Thread{  
main m;
MyThread2(main m){
this.m=m;  
}  
public void run(){  
m.sq(100);  
}  
}  
  
class wk7{  
public static void main(String args[]){  
main obj = new main();
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
} 
	