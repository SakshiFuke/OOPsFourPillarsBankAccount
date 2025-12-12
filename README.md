Bank Account OOP Project (Java)

A simple project to brush up core Object-Oriented Programming concepts.

✨ Overview

This project demonstrates all four pillars of OOP — Abstraction, Encapsulation, Inheritance, and Polymorphism — using a simple banking system.
The goal of this mini-project is to refresh and strengthen Java fundamentals through hands-on practice.

🎯 Objectives

•	Revise and practice core OOP concepts

•	Implement real-world banking rules

•	Strengthen Java class design and method structure

•	Apply abstraction using abstract classes

•	Understand method overriding (runtime polymorphism)


🧩 Features

✔️ Abstraction

•	BankAccount is an abstract class containing abstract methods deposit() and withdraw().

✔️ Encapsulation

•	accountNumber and balance are private fields.

•	Accessed via getter/setter methods.

✔️ Inheritance

•	SavingsAccount and CurrentAccount both extend BankAccount.

✔️ Polymorphism

•	Both subclasses override deposit and withdraw methods.

•	SavingsAccount applies minimum balance rules.

•	CurrentAccount applies overdraft limit rules.


🏦 Classes in This Project

•	BankAccount (abstract class)

    o	Common properties: accountNumber, balance
    
    o	Abstract methods: deposit(), withdraw()
    
•	SavingsAccount

    o	Enforces minimum balance (e.g., ₹500)
    
•	CurrentAccount

    o	Supports overdraft limit (negative balance allowed up to limit)
    
•	BankAccountDemo (main class)

    o	Creates objects and tests all operations

🖥️ Sample Output

TRANSACTION FOR SAVING ACCOUNT 

successfully deposit. new balance = 550.0

withdraw denide. saving account must be contain min balace  500.0

new blance after withdraw 50.0 is 500.0




TRANSACTION FOR CURRENT ACCOUNT 

successfully deposit. new balance = 600.0

new balance is 700.0

new balace after withdra 600.0 is 100.0

successfully deposit. new balance = 4100.0

new balance is 8100.0
new balace after withdra 500.0 is 7600.0
