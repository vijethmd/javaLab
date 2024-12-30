@SuppressWarnings("ALL")
class MyThread extends Thread {
final String message;
final int interval;
MyThread(String message, int interval) {
this.message = message;
this.interval = interval;
}

@Override
public void run() {
while (true) {
try {
System.out.println(message);
Thread.sleep(interval * 1000);
} catch (InterruptedException e) {
System.out.println(e.getMessage());
}
}
}
}

class ThreadImplementation {
public static void main(String[] args) {
MyThread thread1 = new MyThread("BMS College of Engineering",
10);
MyThread thread2 = new MyThread("CSE", 2);
thread1.start();
thread2.start();
}
}