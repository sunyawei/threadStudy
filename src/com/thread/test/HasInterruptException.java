package com.thread.test;

public class HasInterruptException {

	private static class UseThread extends Thread{
    	 
    	   public UseThread(String name){
    		   super(name);
    	   }
    	 
    		@Override
    		public void run() {
    			String threadName = Thread.currentThread().getName();
               while(!isInterrupted()){
            	   try {
					Thread.sleep(1000);
				 } catch (InterruptedException e) {
					System.out.println(threadName+",interrupted flag is "+isInterrupted());
					Thread.interrupted();
					e.printStackTrace();
				 }

               }				
               System.out.println(threadName+",interrupted flag is "+isInterrupted());

    			
    		}
    	 
     }
	
	public static void main(String[] args) {
		UseThread thread = new UseThread("11");
		thread.start();
	}

}
