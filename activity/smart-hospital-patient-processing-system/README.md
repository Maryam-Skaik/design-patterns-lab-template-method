# 🧪 Activity: Smart Hospital Patient Processing System (Template Method Pattern)

## 🎯 Objective

Design a system using the **Template Method Pattern** to manage different types of patient processing while maintaining a fixed workflow.

---

## 📌 Scenario

You are building a **hospital system** that processes patient records across different departments.

In this system:

- Patients go through a standard processing pipeline  
- Different departments handle patients differently  
- Each department applies its own logic based on patient type  

Examples:

- Emergency patients require fast and critical evaluation  
- Regular checkups follow a more detailed and standard process  

---

## ⚠️ Problem Context

Without a proper design:

- Each department may implement the full workflow separately  
- The same process structure is repeated multiple times  
- Execution order may become inconsistent  
- System becomes harder to maintain and extend  

This leads to:

- Code duplication  
- Inconsistent processing logic  
- Poor scalability  

---

## 🧠 Your Task

- Design a **Patient Processing System** using the **Template Method Pattern**
- Define a fixed workflow for all patient records  
- Allow each department to customize how each step is performed  
- Ensure the process order remains unchanged  

---

## 📏 Requirements

Your system must support:

- A **base abstract class** that defines the workflow  
- Multiple **subclasses** representing different departments  
- Each subclass should:
  - Customize step behavior  
  - Follow the same execution order  
- The workflow must remain consistent across all implementations  

---

## 🧩 Design Expectations

Your design should:

- Separate **algorithm structure** from **step implementation**  
- Enforce a fixed execution sequence  
- Allow flexibility in step behavior  
- Avoid duplicating workflow logic  
- Be easily extendable for new departments  

---

## ✅ Expected Outcome

- A reusable and consistent patient processing workflow  
- Different behaviors for each department without changing structure  
- Reduced code duplication  
- Clear separation between structure and behavior  

---

## 🚀 Example Use Case (Conceptual)

A patient record should be processed through the same steps:

- The system processes the record  
- Each department applies its own logic internally  
- The final result is stored based on department-specific rules  

Focus on **workflow consistency and step customization**, not implementation details.

---

## 🧩 Challenge Extension (Optional)

- Add a new department with different processing rules  
- Introduce logging for each step of the workflow  
- How would you handle optional steps in the process?  
- How can you ensure certain steps are shared across all departments?  

---

## 📌 Key Insight

This activity demonstrates how the **Template Method Pattern** enforces a **fixed process structure** while allowing flexible behavior in individual steps, leading to clean, maintainable, and scalable system design.
