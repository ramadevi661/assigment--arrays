package Assesment3;
import java.util.Scanner;
public class DeadLockThread extends Thread{
		static final String name= "rama";
		static final String Bookmyshow= "tickets";
		
		public void run() {
		      synchronized (name) {
		        System.out.println("Deadlock: locked" + name);
		        try {
		            Thread.sleep(1000);
		        } catch (Exception e) {
		        }
		      }
		      System.out.println("Deadlock: waiting for" +Bookmyshow+"......");
		      synchronized (Bookmyshow) {
		        System.out.println("Deadlock: locked" + Bookmyshow);
		        }
		      }
		public static void main(String[] args) {
			DeadLockThread Thread1 = new DeadLockThread();
			 
			  Thread1.start();
		}
	}

