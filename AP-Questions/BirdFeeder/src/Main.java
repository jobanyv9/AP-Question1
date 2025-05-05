public class Main {
    public static void main(String[] args) {
        //Part A
        //Example 1:
        //testSimulateOneDay(500, 12);

        //Example 2: how simulate a bear?
        //testSimulateOneDay(1000, 22);

        //Example 3:
        //testSimulateOneDay(100, 5);

        //Part B
        testSimulateManyDays(0, 10, 12);

    }

    public static void testSimulateOneDay(int currentFood, int numBirds) {
        Feeder feeder = new Feeder();
        feeder.setCurrentFood(currentFood);
        feeder.simulateOneDay(numBirds);
        System.out.printf("Initial food: %d, Remaining after simulating with %d birds: %d%n",
                currentFood, numBirds, feeder.getCurrentFood());

    }

    public static void testSimulateManyDays(int currentFood, int numBirds, int numDays) {
        Feeder feeder = new Feeder();
        feeder.setCurrentFood(currentFood);
        int daysWithFood = feeder.simulateManyDays(numBirds, numDays);
        System.out.printf("Initial food: %d, Remaining after simulating with %d birds over %d days: %d%n",
                currentFood, numBirds, numDays, feeder.getCurrentFood());
        System.out.println("Days with food: "  + daysWithFood);
    }
}