package java21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// A virtual thread is a lightweight thread managed by the JVM, not the
// It is part of Project Loom.
// Unlike platform threads (normal Thread), virtual threads are cheap to create and can scale to millions of concurrent threads.
// Virtual threads ≈ lightweight threads
// Platform threads ≈ heavyweight OS threads
public class VirtualThreadDemo {

    public static void main(String[] args) {

        // Method 1: Using Thread.ofVirtual().start()
        // Start takes Runnable as parameter
        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello from virtual thread!"));

        System.out.println(thread.threadId());

        //Method 2: Using Executors.newVirtualThreadPerTaskExecutor()
        // The executor automatically handles the lifecycle of virtual threads.
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        try(executorService){
           executorService.submit(() -> System.out.println("Running in Virtual Thread 1"));
           executorService.submit(() -> System.out.println("Running in Virtual Thread 2"));
        }
    }

}

// Use Cases of Virtual Threads
//High-concurrency web servers
//Millions of users can be handled simultaneously.
//Example: HTTP requests in a REST API.
//Database-heavy applications
//Each DB call can be a separate virtual thread.
//No need to create large thread pools.
//Network I/O bound tasks
//Downloading/uploading files concurrently.
//Chat or messaging servers.
//Any asynchronous task that previously used CompletableFuture/ThreadPool
