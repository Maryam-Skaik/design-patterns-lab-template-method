package templatemethodpattern;

/**
 * Test / Client Class
 * -------------------
 * This class demonstrates how the Template Method Pattern is used.
 *
 * Key Observations:
 * - The client interacts with the base type (SubmissionProcessor)
 * - The same method (processSubmission) is called
 * - Different behaviors occur depending on the actual object type
 *
 * This shows:
 * - Polymorphism
 * - Reusability of the algorithm structure
 *
 * @author Maryam
 */
public class Main {

    public static void main(String[] args) {

        // Computer Science processing
        SubmissionProcessor cs = new CSSubmissionProcessor();
        cs.processSubmission("student1.zip");

        System.out.println("----------------------");

        // Design processing
        SubmissionProcessor design = new DesignSubmissionProcessor();
        design.processSubmission("design.fig");
    }
}
