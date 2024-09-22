package threads;

class one{

 synchronized void table(int n){
	
	for (int i=1; i<=5; i++) {
		
		System.out.println(n*i);
		
		try {
			
			Thread.sleep(1000);}catch(Exception w){}
	    }  
     }
}    

public class SynchronizedThread {

   public static void main (String [] args) throws InterruptedException{
	
           one o = new one();
           
           Thread t1 = new Thread() {
        	 
        	   public void run() {
        		   
        		   o.table(10);
        		   
        	   }
       };
       
            Thread t2 = new Thread() {
            	
            	public void run() {
            		
            		o.table(20);
            		
            	}
            	
            };
       
           t1.start();
           
           t2.start();
           
           t1.join();
           
           t2.join();
           
           
           System.out.println("Done");
	
}

}
