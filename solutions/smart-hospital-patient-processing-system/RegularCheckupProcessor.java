package templatemethodpatternhospital;

/**
 * Concrete Class (Regular Checkup Department)
 * --------------------------------------------
 * This class customizes patient processing
 * for regular medical checkups.
 *
 * Focus:
 * - Detailed examination
 * - Standard evaluation
 * - Scheduled treatment process
 *
 * Key Point:
 * - Same workflow structure
 * - Different internal logic
 *
 * @author Maryam
 */
public class RegularCheckupProcessor extends PatientProcessor {

    /**
     * Step 1: Register regular patient
     */
    @Override
    protected String registerPatient(String patientName) {
        return "Checkup: Registering patient " + patientName;
    }

    /**
     * Step 2: Perform detailed examination
     */
    @Override
    protected String checkCondition(String patientData) {
        return patientData + " | Performing full medical examination";
    }

    /**
     * Step 3: Apply standard treatment plan
     */
    @Override
    protected String provideTreatment(String conditionData) {
        return conditionData + " | Providing standard medical consultation";
    }

    /**
     * Step 4: Generate regular medical report
     */
    @Override
    protected String generateReport(String treatmentData) {
        return treatmentData + " | Regular checkup report generated";
    }

    /**
     * Step 5: Store patient record
     */
    @Override
    protected String storeRecord(String report) {

        String finalOutput = "Checkup Record Stored: " + report;

        System.out.println(finalOutput);

        return finalOutput;
    }
}
