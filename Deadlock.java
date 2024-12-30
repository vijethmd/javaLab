class AA {
   synchronized void foo(BB b) {
        	String name = Thread.currentThread().getName();
	System.out.println(name + " entered A.foo");
	try {
		Thread.sleep(1000);
	} catch(Exception e) {
		System.out.println("A Interrupted");
	}
	System.out.println(name + " trying to call B.last()");
	b.last();
   }
   synchronized void last() {
	System.out.println("Inside A.last");
   }
}

class BB {
   synchronized void bar(AA a) {
      String name = Thread.currentThread().getName();
	System.out.println(name + " entered BB.bar");
	try {
		Thread.sleep(1000);
	} catch(Exception e) {
		System.out.println("B Interrupted");
	}
     	System.out.println(name + " trying to call A.last()");
	a.last();
    }
    synchronized void last() {
	System.out.println("Inside A.last");
    }
}

class Deadlock implements Runnable {
	AA a = new AA();
	BB b = new BB();
	Deadlock() {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		a.foo(b); // get lock on a in this thread.
		System.out.println("Back in main thread");
	}
	public void run() {
		b.bar(a); // get lock on b in other thread.
		System.out.println("Back in other thread");
	}
	public static void main(String args[]) {
		new Deadlock();
	}
}