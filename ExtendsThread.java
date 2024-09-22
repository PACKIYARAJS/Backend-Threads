package threads;


   class threads1 extends Thread{
	   
	   public void run(){
	   
	   for (int i=0; i<=5; i++ ) {
		   
		   System.out.println("Thread "+i);
		   
		   try {
		   
		   Thread.sleep(1000);} catch(Exception e) {}
		   
	   }
	   
	 }   
   
  }
   
   class threads2 extends Thread{
	   
	   public void run() {
		   
		   for (int i=0; i<=5 ; i++) {
			   
			   System.out.println(i);
			   
			   try {
			   
			   Thread.sleep(1000);} catch(Exception e) {}
		   }
		   
	   }
   }


public class ExtendsThread {
	
           public static void main (String[] args) throws InterruptedException {
        	   
        	   threads1 o = new threads1();
        	   
        	   threads2 t = new threads2();
        	   
        	   o.start();
        	   
        	   t.start();
        	   
        	   if (o.isAlive()) {
        		   
        		   System.out.println("Yes");
        	   }
        	   
        	   o.join();
        	   
        	   t.join();
        	   
               if (o.isAlive()) {
        		   
        		   System.out.println("Yes");
        	   }
        	   System.out.println("DONE");
           }
	

}
