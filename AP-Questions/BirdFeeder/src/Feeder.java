import java.util.Random;

public class Feeder
{

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized in the constructor and
     * always greater than or equal to zero
     */
    private int currentFood;

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
     * as described in part (a)
     * Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    { /* to be implemented in part (a) */
        Random random = new Random();
        int standardFood = random.nextInt(41) + 10;//generates a number from 0 to 40 (inclusive)
        int consumedFood = numBirds * standardFood;
        if (consumedFood <= currentFood)
            currentFood -= consumedFood;
        else
            currentFood = 0;

        System.out.println("Food consumed by each bird: " + standardFood + " -> consumed food : " + consumedFood);
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the feeder in this simulation,
     * as described in part (b)
     * Preconditions: numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays)
    { /* to be implemented in part (b) */
        int countDays = 0;
        if (currentFood > 0) {
            for(int i = 0; i < numDays; i++) {
                simulateOneDay(numBirds);
                countDays++;
                if (currentFood == 0)
                    break;
            }
        }

        return countDays;
    }
// There may be instance variables, constructors, or methods that are not shown.
    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }
}