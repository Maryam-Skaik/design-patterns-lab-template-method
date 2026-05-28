package templatemethodpatternhospital;

/**
 * Concrete Class (Emergency Department)
 * -------------------------------------
 * This class customizes the workflow behavior
 * for emergency patients.
 *
 * Focus:
 * - Fast processing
 * - Critical condition handling
 * - Immediate treatment
 *
 * Key Point:
 * - Workflow remains the SAME
 * - Only step behavior changes
 *
 * @author Maryam
 */
public class EmergencyPatientProcessor extends PatientProcessor {

    /**
     * Step 1: Register emergency patient
     */
    @Override
    protected String registerPatient(String patientName) {
        return "Emergency: Registering critical patient " + patientName;
    }

    /**
     * Step 2: Perform urgent condition check
     */
    @Override
    protected String checkCondition(String patientData) {
        return patientData + " | Performing immediate vital check";
    }

    /**
     * Step 3: Apply emergency treatment
     */
    @Override
    protected String provideTreatment(String conditionData) {
        return conditionData + " | Applying emergency treatment";
    }

    /**
     * Step 4: Generate emergency report
     */
    @Override
    protected String generateReport(String treatmentData) {
        return treatmentData + " | Emergency case report generated";
    }

    /**
     * Step 5: Store patient record
     */
    @Override
    protected String storeRecord(String report) {

        String finalOutput = "Emergency Record Stored: " + report;

        System.out.println(finalOutput);

        return finalOutput;
    }
}
