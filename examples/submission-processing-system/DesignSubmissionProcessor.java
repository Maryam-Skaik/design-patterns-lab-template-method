package templatemethodpattern;

/**
 * Concrete Class (Design Department)
 * ----------------------------------
 * This class customizes the processing steps for design submissions.
 *
 * Focus:
 * - UI/UX evaluation
 * - Design consistency
 * - File format compatibility (Figma, PSD, etc.)
 *
 * Key Point:
 * - Same workflow as all processors
 * - Different internal logic per step
 *
 * @author Maryam
 */
public class DesignSubmissionProcessor extends SubmissionProcessor {

    /**
     * Step 1: Load design file
     */
    @Override
    protected String loadFile(String file) {
        return "Design: Loading UI file " + file;
    }

    /**
     * Step 2: Validate design file format
     */
    @Override
    protected String validateFormat(String data) {
        return data + " | Checking PSD/Figma format compatibility";
    }

    /**
     * Step 3: Analyze design quality
     */
    @Override
    protected String analyzeContent(String data) {
        return data + " | Evaluating UI consistency and layout";
    }

    /**
     * Step 4: Calculate score based on design quality
     */
    @Override
    protected String calculateScore(String analysis) {
        return analysis + " | Score based on design quality";
    }

    /**
     * Step 5: Store and print result
     */
    @Override
    protected String storeResult(String result) {
        String output = "Design Result Stored: " + result;
        System.out.println(output);
        return output;
    }
}
