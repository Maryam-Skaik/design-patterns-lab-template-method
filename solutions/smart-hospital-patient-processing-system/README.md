# 🧪 Activity: Smart Hospital Patient Processing System - Solution

## 🎯 Objective

This solution demonstrates how to design a **structured and extensible patient processing system** using the **Template Method Pattern**.

The main goal is to ensure that:

* All patient records follow a **fixed processing workflow**
* Each department can customize **how each step is executed**
* The system avoids duplication of process structure
* New departments can be added without modifying existing workflow logic
* The design remains **consistent, scalable, and maintainable**

---

## 🧠 Solution Explanation

### Step 1: Identified Main Components

* `PatientProcessor` (Abstract Template Class)
* `EmergencyPatientProcessor` (Concrete Class)
* `RegularCheckupProcessor` (Concrete Class)
* `Main` (Client / Execution class)

---

## ⚠️ Step 2: Identified the Core Problem

Without the Template Method Pattern:

* Each department would implement the full workflow separately
* Processing steps might appear in different orders
* Code duplication across departments
* Hard to maintain and update the workflow globally
* Risk of inconsistent patient handling

### 💡 Key Insight

Patient processing has two parts:

* **Fixed structure** → same across all departments
* **Variable behavior** → differs per department

These two concerns must be separated.

---

## 🧩 Step 3: Introduced Template Method Structure

The system defines a central algorithm:

```java
processPatient(String patientName)
```

This method:

* Defines the **exact processing sequence**
* Is marked `final` to prevent modification
* Ensures all departments follow the same workflow

### Workflow Steps:

1. Register patient
2. Check condition
3. Provide treatment
4. Generate report
5. Store record

---

## 🧠 Step 4: Introduced Primitive Operations (Hooks)

The abstract class defines step-level operations:

* `registerPatient()`
* `checkCondition()`
* `provideTreatment()`
* `generateReport()`
* `storeRecord()`

### Why this matters:

* Each step can be customized per department
* Workflow structure remains unchanged
* Enables controlled flexibility inside a fixed algorithm

---

## 🏥 Step 5: Emergency Department Behavior

### Class: `EmergencyPatientProcessor`

Focus:

* Fast response
* Critical condition handling
* Immediate treatment decisions

### Custom behavior per step:

* Quick registration of critical patients
* Immediate vital checks
* Emergency treatment procedures
* Urgent report generation

### Key Idea:

> Speed and prioritization are more important than detailed evaluation.

---

## 🩺 Step 6: Regular Checkup Department Behavior

### Class: `RegularCheckupProcessor`

Focus:

* Detailed examination
* Standard evaluation process
* Routine medical assessment

### Custom behavior per step:

* Standard patient registration
* Full medical examination
* Normal consultation procedures
* Structured reporting

### Key Idea:

> Accuracy and completeness are prioritized over speed.

---

## 🔄 Step 7: Template Method Pattern Structure

### Abstract Class (Template)

`PatientProcessor`

Responsible for:

* Defining the workflow structure
* Enforcing execution order
* Declaring abstract steps for customization

### Concrete Classes

* `EmergencyPatientProcessor`
* `RegularCheckupProcessor`

Responsible for:

* Implementing step-specific behavior
* Preserving workflow order
* Adding domain-specific logic

---

## 🧾 Step 8: Role of Main Class

The `Main` class acts as the **client entry point**, responsible for:

* Creating department-specific processors
* Executing the same workflow method
* Demonstrating polymorphic behavior

### Key Observation:

Same method call:

```java
processPatient()
```

Produces different results depending on the object type.

---

## 🧩 UML Diagram Representation

```text
+---------------------------+
|   PatientProcessor        |
+---------------------------+
| + processPatient()        |
| (final template method)   |
+---------------------------+
| + registerPatient()       |
| + checkCondition()        |
| + provideTreatment()      |
| + generateReport()        |
| + storeRecord()           |
+---------------------------+
           ▲
   ---------------------
   |                   |
+---------------------------+   +---------------------------+
| EmergencyPatientProcessor |   | RegularCheckupProcessor   |
+---------------------------+   +---------------------------+
| override steps            |   | override steps            |
+---------------------------+   +---------------------------+
           ▲
           |
         Main
```

---

## ⚙️ Step 9: Java Implementation Highlights

* Enforced workflow consistency using `final` method
* Clear separation between algorithm structure and step behavior
* Each department overrides only what it needs
* No duplication of workflow logic
* Easy to extend with new departments (e.g., Surgery, Pediatrics)

---

## 🧾 Example Execution Flow

```java
PatientProcessor emergency = new EmergencyPatientProcessor();
emergency.processPatient("Tia");

PatientProcessor checkup = new RegularCheckupProcessor();
checkup.processPatient("Tima");
```

---

## 📌 Example Console Output

```text
Emergency: Registering critical patient Tia | Performing immediate vital check | Applying emergency treatment | Emergency case report generated
Emergency Record Stored: Emergency: Registering critical patient Tia | Performing immediate vital check | Applying emergency treatment | Emergency case report generated

---------------------------

Checkup: Registering patient Tima | Performing full medical examination | Providing standard medical consultation | Regular checkup report generated
Checkup Record Stored: Checkup: Registering patient Tima | Performing full medical examination | Providing standard medical consultation | Regular checkup report generated
```

---

## 🚀 Advantages of This Design

* Enforces a **fixed and reliable workflow**
* Eliminates duplicate process logic
* Improves maintainability and readability
* Easy to extend with new departments
* Ensures consistent execution order
* Strong separation between structure and behavior

---

## 📌 Key Insight

This activity demonstrates the core idea of the **Template Method Pattern**:

> Define the skeleton of an algorithm in a base class, while allowing subclasses to redefine specific steps without changing the structure.

It is widely used in real systems such as:

* Data processing pipelines
* Framework lifecycle methods
* ETL systems
* Backend request processing flows
