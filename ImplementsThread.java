package threads;

  /*  class thread1 implements Runnable {
    	
    	public void run() {
    		
    		for (int i=0; i<=5; i++) {
    			
    			System.out.println(i);
    			
    			try {
    				
    				Thread.sleep(1000);}catch(Exception w) {}
    			
    		}
    		
    	}
    }*/
    
class thread2 extends Thread{
    	
    	public void run() {
    		
    		for (int i=5; i<=10; i++) {
    			
    			System.out.println( "* "+ i);
    			
    			try {
    				
                    Thread.sleep(1000);} catch (Exception e) {}
    			
    		}
    		
    	}
    }

public class ImplementsThread{
	
	public static void main(String[] args) throws InterruptedException {
		
	//thread1 o = new thread1();
		
		        // ANONYMOUS CLASS
	
	Runnable o = /*new Runnable*/()-> {
		
		/*public void run() {*/
		
		for (int i=0; i<=5; i++) {
			
			System.out.println("# "+i);
			
			try {
				
				Thread.sleep(1000);}catch(Exception w) {}
		}
		
		//}
	
	};
	
	
	thread2 t = new thread2();
	
	Thread t1 = new Thread(o);
	
	t1.start();
	
	t.start();
	
	t1.setName("Anonymous THREAD");
	
	System.out.println(t1.getName());
	
	System.out.println(t.getName());
	
	t1.setPriority(8);
	
	System.out.println(t1.getPriority());
	
	//o.join();
	
	t1.join();
	
	t.join();
		
	System.out.println("Done the Exception");
	
	}

}
