package java21;

// ScopedValue is a way to pass read-only data implicitly to methods within a well-defined execution scope.
// ScopedValue is a new Java 21 feature (preview) that provides a safe, modern replacement for ThreadLocal.
//In simple words:
    //Value is available only inside a scope
    //Value is immutable
    //Value is automatically cleaned up
    //Designed for Virtual Threads & Structured Concurrency


// Key Differences (Important)
    //Feature	                 ThreadLocal	     ScopedValue
    //Java version	             Old (Java 1.2)    	 Java 21
    //Mutability	             Mutable	         Immutable
    //Cleanup	                 Manual (remove)	 Automatic
    //Memory leaks	             High risk	         No risk
    //Thread pool safe	         ❌ Risky	         ✅ Safe
    //Virtual thread friendly  	 ❌ Weak	         ✅ Designed for it
    //Debugging	                 Hard	             Easy

public class ScopedValueDemo {

    static final ScopedValue<String> USER = ScopedValue.newInstance();

    static void main() {

        // ✔ No setter
        //✔ No remove
        //✔ No memory leak
        ScopedValue.where(USER, "Ravi")
                .run(ScopedValueDemo::greet);

        System.out.println("----------------------------------");
        // Nested  Scope
        ScopedValue.where(USER, "Admin").run(() -> {
            System.out.println(USER.get()); // Admin

            ScopedValue.where(USER, "Guest").run(() -> {
                System.out.println(USER.get()); // Guest
            });

            System.out.println(USER.get()); // Admin
        });

        System.out.println("----------------------------------");
        //  Scoped Value WIth return Value
        String result =
                ScopedValue.where(USER, "Ravi")
                        .call(() -> "User is " + USER.get());

        System.out.println(result);

        System.out.println("----------------------------------");



    }

    static void greet() {
        System.out.println("Hello " + USER.get());
    }
}
