package java17;

import java.util.Random;
import java.util.random.RandomGenerator;

// Better control over random number generation.
// API that supports modern algorithms like SplittableRandom, LXM, and Xoshiro, allowing better performance, quality, and reproducibility.
// SplittableRandom
// LXM
// Xoshiro
public class RandomGeneratorApi {

    public static void main(String[] args) {

        RandomGenerator random = RandomGenerator.getDefault();
        System.out.println(random.nextInt(1, 1000));
    }
}
