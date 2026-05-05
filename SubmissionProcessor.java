package templatemethodpattern;

/**
 * Abstract Base Class (Template)
 * --------------------------------
 * This class defines the TEMPLATE METHOD which represents
 * the fixed workflow (algorithm structure) for processing a submission.
 *
 * Key Idea:
 * - The algorithm structure is FIXED here.
 * - Subclasses are NOT allowed to change the order of execution.
 * - Subclasses ONLY implement the behavior of each step.
 *
 * This is the core of the Template Method Pattern.
 *
 * @author Maryam
 */
public abstract class SubmissionProcessor {

    /**
     * TEMPLATE METHOD
     * ----------------
     * This method defines the full algorithm (workflow).
     *
     * Important:
     * - Marked as 'final' → cannot be overridden by subclasses.
     * - Ensures that ALL submissions follow the SAME sequence of steps.
     *
     * Workflow:
     * 1. Load file
     * 2. Validate format
     * 3. Analyze content
     * 4. Calculate score
     * 5. Store result
     */
    public final void processSubmission(String file) {
        String rawData = loadFile(file);          // Step 1
        String validated = validateFormat(rawData); // Step 2
        String analyzed = analyzeContent(validated); // Step 3
        String result = calculateScore(analyzed); // Step 4
        storeResult(result);                      // Step 5
    }

    /**
     * Primitive Operations (Abstract Methods)
     * ---------------------------------------
     * These methods represent the individual steps of the algorithm.
     *
     * Subclasses MUST implement them.
     * Each subclass provides its own logic depending on the context.
     */

    // Step 1: Load the submission file
    protected abstract String loadFile(String file);

    // Step 2: Validate file format
    protected abstract String validateFormat(String data);

    // Step 3: Analyze content
    protected abstract String analyzeContent(String data);

    // Step 4: Calculate score or result
    protected abstract String calculateScore(String analysis);

    // Step 5: Store final result
    protected abstract String storeResult(String result);
}
