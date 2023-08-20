class newthread extends Thread{
	Thread t;
	newthread()
	{
	   t1=new Thread(this,"Thread_1");
		t2=new Thread(this,"Thread_2");
		t1.start();
		t2.start();
		}
		public void run(){
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.equals(t2));
		}
		}
		class Multithread{
		public static void main(String[]args){
		new newthread();
		}
		}
		
		