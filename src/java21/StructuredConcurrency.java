package java21;

// Structured Concurrency is a Java 21 (preview) feature that makes working with
// multiple concurrent tasks simpler, safer, and easier to reason about.
// Structured Concurrency treats multiple concurrent tasks as a single unit of work.

import java.util.concurrent.Future;
import java.util.concurrent.*;

// In simple words:
    //Start many tasks together
    //Wait for them together
    //If one fails → handle all cleanly
    //No “forgotten” background threads
public class StructuredConcurrency {

    static String getUser() throws InterruptedException {
        Thread.sleep(1000);
        return "User-Laddoo";
    }

    static String getOrder() throws InterruptedException {
        Thread.sleep(1000);
        return "Order-123";
    }

    public static void main(String[] args) throws Exception {

      /*  try (var scope = new StructuredTaskScope.ShutdonOnFailure()) {
            Future<String> user  = scope.fork(() -> getUser());
            Future<String> order = scope.fork(() -> getOrder());

            scope.join();            // wait for all tasks
            scope.throwIfFailed();   // fail fast

            System.out.println(user.resultNow());
            System.out.println(order.resultNow());
        }*/
    }
}
