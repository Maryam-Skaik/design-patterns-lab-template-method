package templatemethodpattern;

/**
 * Concrete Class (Computer Science Department)
 * --------------------------------------------
 * This class provides a specific implementation of the algorithm steps
 * for Computer Science submissions.
 *
 * Focus:
 * - Code-based evaluation
 * - Syntax checking
 * - Correctness validation
 *
 * Note:
 * - It DOES NOT change the workflow.
 * - It ONLY customizes how each step behaves.
 *
 * @author Maryam
 */
public class CSSubmissionProcessor extends SubmissionProcessor {

    /**
     * Step 1: Load code submission
     */
    @Override
    protected String loadFile(String file) {
        return "CS: Loading code submission from " + file;
    }

    /**
     * Step 2: Validate programming file structure
     */
    @Override
    protected String validateFormat(String data) {
        return data + " | Validating Java/Python file structure";
    }

    /**
     * Step 3: Analyze code (syntax, logic, etc.)
     */
    @Override
    protected String analyzeContent(String data) {
        return data + " | Running syntax analysis";
    }

    /**
     * Step 4: Calculate score based on correctness
     */
    @Override
    protected String calculateScore(String analysis) {
        return analysis + " | Score based on correctness";
    }

    /**
     * Step 5: Store and print result
     */
    @Override
    protected String storeResult(String result) {
        String finalOutput = "CS Result Stored: " + result;
        System.out.println(finalOutput);
        return finalOutput;
    }
}
