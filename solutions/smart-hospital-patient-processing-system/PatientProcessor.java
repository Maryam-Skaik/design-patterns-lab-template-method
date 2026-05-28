package templatemethodpatternhospital;

/**
 * Abstract Base Class (Template)
 * --------------------------------
 * This class defines the TEMPLATE METHOD which represents
 * the fixed workflow for processing hospital patients.
 *
 * Key Idea:
 * - The workflow structure is FIXED here.
 * - Subclasses CANNOT change the order of execution.
 * - Subclasses ONLY customize how each step behaves.
 *
 * This is the core idea of the Template Method Pattern.
 *
 * @author Maryam
 */
public abstract class PatientProcessor {

    /**
     * TEMPLATE METHOD
     * ----------------
     * Defines the complete patient processing workflow.
     *
     * Important:
     * - Marked as 'final' to prevent overriding
     * - Guarantees that ALL departments follow the SAME process
     *
     * Workflow:
     * 1. Register patient
     * 2. Check patient condition
     * 3. Provide treatment process
     * 4. Generate medical report
     * 5. Store patient record
     */
    public final void processPatient(String patientName) {

        String patient = registerPatient(patientName); // Step 1
        String checked = checkCondition(patient);      // Step 2
        String treated = provideTreatment(checked);    // Step 3
        String report = generateReport(treated);       // Step 4
        storeRecord(report);                           // Step 5
    }

    /**
     * Primitive Operations (Abstract Methods)
     * ---------------------------------------
     * These methods represent the customizable steps
     * of the algorithm.
     *
     * Each department implements its own behavior.
     */

    // Step 1: Register patient
    protected abstract String registerPatient(String patientName);

    // Step 2: Check patient condition
    protected abstract String checkCondition(String patientData);

    // Step 3: Apply treatment process
    protected abstract String provideTreatment(String conditionData);

    // Step 4: Generate medical report
    protected abstract String generateReport(String treatmentData);

    // Step 5: Store final patient record
    protected abstract String storeRecord(String report);
}
