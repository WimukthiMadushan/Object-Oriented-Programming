# Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm centered around the idea of designing software using **objects**, which represent real-world entities. Instead of writing code as a collection of unrelated functions and variables, OOP groups related data and behaviors into a single unit called an **object**.

Each object contains:

- **Attributes (data):** characteristics or properties of the object  
- **Methods (behavior):** functions or actions the object can perform  

This structure makes programs more modular, scalable, reusable, and easier to maintain.

Consider a **Car** as an object:

- **Attributes:** model, color, engine type, year  
- **Methods:** start(), accelerate(), brake(), stop()

In web browsers, the `localStorage` is a good example of an **object** in Object-Oriented Programming.  
It contains both **data** and **methods**, just like any OOP object.

#### **Attributes (Data)**
`localStorage` stores key–value data in the browser.  
These saved items act as its internal **state**.

Example stored data:
- "username" → "JohnDoe"
- "theme" → "dark"

#### **Methods (Behavior)**
`localStorage` provides built in methods to interact with its data:

- `setItem(key, value)` → stores data  
- `getItem(key)` → retrieves data  
- `removeItem(key)` → deletes a specific item  
- `clear()` → removes all stored data  

By modeling software components in this way, OOP helps developers create systems that are organized, intuitive, and aligned with real world concepts.


Here the four core principles of OOP

### 1. **Encapsulation**
Encapsulation is the process of bundling data (variables) and methods (functions) inside a class and restricting direct access to certain components. Controll the access to them using access modifiers. It protects the internal state of the object and ensures controlled interaction through getters and setters.

| Modifier                 | Access Level                                               | Usage in Encapsulation                     |
| ------------------------ | ---------------------------------------------------------- | ------------------------------------------ |
| **private**              | Accessible only within the same class                      | Most commonly used to hide data (fields)   |
| **public**               | Accessible from anywhere                                   | Used for getters, setters, and public APIs |
| **protected**            | Accessible within same class, subclasses, and same package | Useful for inheritance scenarios           |
| **default** (no keyword) | Accessible only within the same package                    | Moderate level accessibility               |

---

### 2. **Abstraction**

Abstraction is the concept of hiding unnecessary implementation details while exposing only the essential features of an object. This allows developers to focus on **what** an object does rather than **how** it does it internally.

**Example: TV Remote**

A TV remote as a example of abstraction.

When you press buttons like:

- **Power ON/OFF**
- **Volume Up / Volume Down**
- **Change Channel**
- **Mute**

you do not need to know:

- how the infrared signal is generated  
- how the TV processes that signal  
- how the internal electronics handle the command  

These details are **hidden**.  
The remote exposes only the essential **actions** you need.

**Benefits of Abstraction**

- **Reduces complexity** by hiding low level implementation  
- **Limits the impact of future changes**, since only a small, stable interface is exposed  
- **Improves security and reliability** by controlling access

---

### 3. **Inheritance**

Inheritance is an OOP concept where one class (child) can **reuse**, **extend**, or **modify** the properties and behaviors of another class (parent).  
It allows code reusability and avoids duplication by enabling common logic to live in a base class.

**Example: Vehicles**

Imagine a general class called **Vehicle**.

All vehicles share some common attributes:

- brand  
- model  
- speed  

And common behaviors:

- start()  
- stop()  

A **Car**, **Bike**, or **Truck** is a specialized type of Vehicle.  
Rather than rewriting the same attributes and functions, these classes **inherit** from Vehicle and only add what is unique to them.

---

### 4. **Polymorphism**
Polymorphism means **"many forms"**.  
It allows the same method or action to behave differently depending on the object that is calling it.

**Example: Animals Making Sounds**

Different animals make different sounds, but the action is still the same: **makeSound()**.

For example:

- A **Dog** barks  
- A **Cat** meows  
- A **Cow** moos  

Even though the method name is the same (`makeSound()`), the behavior changes depending on the object.  
This is polymorphism in action.
