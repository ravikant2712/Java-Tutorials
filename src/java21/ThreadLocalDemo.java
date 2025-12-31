package java21;


//ThreadLocal provides thread-confined variables.
//👉 Each thread gets its own separate copy of a variable.
//   Mutable
//👉 One thread cannot see or modify another thread’s value.
//   Same variable name, but different value for each thread


//2️⃣ Why Do We Need ThreadLocal?
//Normally, variables are shared between threads → causes data corruption.
//Example problem:
    //User A request
    //User B request
    //Both run on different threads
    //If they share the same variable → ❌ wrong data
//ThreadLocal solves this.

//Problems with ThreadLocal
    //Memory leaks
      //If remove() is forgotten
    //Mutable state
      //Any code can change the value
    //Bad with thread pools
      //Threads are reused
    //Hard to reason about
      //Value can appear “from nowhere”
public class ThreadLocalDemo {

    static ThreadLocal<String> CURRENT_USER = new ThreadLocal<>();

    static void main() {
        Runnable task = () -> {
            CURRENT_USER.set("Laddoo");
            process();
            CURRENT_USER.remove(); // VERY IMPORTANT
        };

        new Thread(task).start();
    }


    static void process() {
        System.out.println("User: " + CURRENT_USER.get());
    }
}


