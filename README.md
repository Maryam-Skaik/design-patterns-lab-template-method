# 🎯 Design Patterns Lab — Template Method Pattern

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Category](https://img.shields.io/badge/Design%20Pattern-Behavioral-red.svg)
![Pattern](https://img.shields.io/badge/Pattern-TemplateMethod-pink)
![Week](https://img.shields.io/badge/Week-7-green)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-orange.svg)
![Focus](https://img.shields.io/badge/Focus-OOP%20%26%20Design%20Thinking-purple.svg)

---

## 🎥 Lecture Video

This repository accompanies the lecture on the **Template Method Pattern**, focusing on real-world workflow-based systems.

▶️ Watch on YouTube:  

[Lecture Video](https://youtu.be/steUzN2jsbQ)

---

## 🧠 Overview

The **Template Method Pattern** is a behavioral design pattern that defines the **skeleton of an algorithm in a base class**, while allowing subclasses to customize specific steps without changing the overall structure.

It is used when multiple classes follow the **same workflow**, but differ in how certain steps are implemented.

---

## 💡 Core Idea

> Define the structure of an algorithm in a superclass, but let subclasses redefine specific steps without modifying the algorithm itself.

---

## 🏗️ Real-World Analogy

Think about preparing different types of meals:

- The process is always similar:
  1. Prepare ingredients  
  2. Cook / Assemble  
  3. Serve  

But the details differ:
- Pizza → baked with toppings  
- Salad → assembled raw ingredients  
- Pasta → boiled and mixed with sauce  

👉 Same structure, different implementations

---

## ⚙️ When to Use This Pattern

Use Template Method when:

- A process has a **fixed sequence of steps**
- Some steps **vary across implementations**
- You want to avoid **code duplication**
- You want to enforce a **strict workflow order**

---

## ❌ Problem Without This Pattern

Without Template Method:

- Each class repeats the same workflow logic
- Execution order may become inconsistent
- Code becomes harder to maintain and extend
- Changes in workflow must be duplicated everywhere

---

## 🧩 Solution Approach

The pattern separates responsibilities:

### 🔵 Base Class (Template)
- Defines the full algorithm structure
- Controls execution order
- Declares abstract steps

### 🟢 Subclasses
- Implement specific step behaviors
- Customize logic per use case
- Cannot modify the algorithm structure

---

## 📊 UML Structure

```
                <<abstract>>
           SubmissionProcessor
          -----------------------
          + processSubmission()
          # loadFile()
          # validateFormat()
          # analyzeContent()
          # calculateScore()
          # storeResult()
                  ▲
                  │
     ┌────────────┴────────────┐
     │                         │
CSSubmissionProcessor   DesignSubmissionProcessor
```

---

## 🧪 Example Scenario: University Submission System

Every student submission follows the same pipeline:

1. Load file  
2. Validate format  
3. Analyze content  
4. Calculate score  
5. Store result  

However, each department applies different rules:

- 💻 Computer Science → code analysis and correctness checks  
- 🎨 Design → UI/UX evaluation and format validation  
- 📊 Business → structure, clarity, and reporting evaluation  

---

## 🧱 Key Concept Breakdown

### 🔵 Template Method (in Base Class)
- Defines the **full workflow**
- Ensures steps are executed in a fixed order
- Prevents subclasses from changing the algorithm structure

### 🟢 Primitive Operations (in Subclasses)
- Represent each step of the algorithm
- Are overridden by subclasses
- Contain domain-specific behavior

---

## 🔥 Core Behavior Explained

When the system runs:

- The base class controls the **execution flow**
- Each step is delegated to subclass implementations
- Subclasses only influence **how steps behave**, not **when they run**

This ensures:
- Consistency in execution
- Flexibility in implementation

---

## ⚖️ Design Principle Behind It

This pattern follows the principle:

> “Inversion of Control”

The base class defines the flow, and subclasses plug into it.

---

## 🧠 Key Insight

A very important mental model:

- **Parent class = defines WHAT happens and WHEN**
- **Child class = defines HOW each step happens**

---

## 📌 Template Method vs Strategy (Preview for Next Lecture)

| Aspect | Template Method | Strategy |
|------|----------------|----------|
| Structure | Fixed workflow | Flexible behavior |
| Approach | Inheritance | Composition |
| Change point | Steps inside algorithm | Entire algorithm |
| Timing | Compile-time | Runtime |

---

## 🧪 Practice Exercise

### 🎓 Hospital Patient Processing System

Design a system where all patient records follow the same workflow:

1. Load patient file  
2. Validate record  
3. Analyze condition  
4. Assign priority  
5. Store record  

### Departments:

- 🚨 Emergency Department (fast, critical evaluation)
- 🩺 Regular Checkup (detailed but standard processing)

### Optional Extension:
- Add Pediatric Department with specialized evaluation rules

---

## 💾 Solutions

📁 [`solutions/`](solutions/)

All activity solutions are available inside the `/solutions` folder.

Each solution includes:

* UML diagrams and design explanation
* Clean and well-structured Java implementation
* Notes about relationships and design decisions
* Fixed workflow explanation using Template Method Pattern
* Step customization behavior per department
* Example usage through `Main.java`

---

### Included Solutions

* 🏥 Smart Hospital Patient Processing System

---

> Students are encouraged to complete the activities independently first, then use the provided solutions to compare implementations, understand design decisions, and explore alternative approaches.

---

## 🎯 Learning Outcome

After completing this pattern, you should be able to:

- Identify workflows with fixed structure and variable steps
- Apply inheritance correctly for behavioral variation
- Understand when NOT to duplicate logic across classes
- Design systems with consistent execution flow

---

## 🚀 Final Insight

The Template Method Pattern is most powerful when:

> You need a guaranteed process structure, but flexible step-level behavior.

