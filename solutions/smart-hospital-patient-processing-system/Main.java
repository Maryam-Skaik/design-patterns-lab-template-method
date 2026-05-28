package templatemethodpatternhospital;

/**
 * Test / Client Class
 * -------------------
 * This class demonstrates how the Template Method Pattern works.
 *
 * Key Observations:
 * - Client works with the base type (PatientProcessor)
 * - Same method is called for all departments
 * - Different behaviors occur depending on object type
 *
 * This demonstrates:
 * - Polymorphism
 * - Workflow reusability
 * - Consistent algorithm structure
 *
 * @author Maryam
 */
public class Main {

    public static void main(String[] args) {

        // Emergency patient processing
        PatientProcessor emergency = new EmergencyPatientProcessor();

        emergency.processPatient("Tia");

        System.out.println("---------------------------");

        // Regular checkup processing
        PatientProcessor checkup = new RegularCheckupProcessor();

        checkup.processPatient("Tima");
    }
}
