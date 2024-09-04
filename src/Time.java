public class Time {

    //method which returns current timestamp
    public static double start_counter() {
        return (double) System.nanoTime();
    }

    //method which accepts result of start_counter method and returns
    // elapsed time between actions
    public static double stop_counter(double start) {
        return (double) System.nanoTime() - start;
    }
}
