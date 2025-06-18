# Material Management System

This project is a simple digital content management system developed with Java. After user login, books and movies can be added to the system, rated, and filtered by specific criteria.

## 🚀 Features

- 📚 Book and 🎬 Movie classes derived from a common abstract `Material` class
- 🧑‍💻 Basic user authentication (`User`)
- 🏷️ Category creation and assignment to materials (`Category`)
- ⭐ Rating system and average score calculation
- 🔍 Functional operations:
  - Show material with highest average score
  - Show movie with lowest average score
  - Show most expensive material by category
  - List all movies a person acted in

## 🛠️ Technologies

- Java 17
- Object-Oriented Programming (OOP)
- ArrayList and loop structures
- No user input (data is hardcoded in `main` for demonstration)

## 🧪 Testing

You can test the project by creating sample objects in the `main` method.  
Default user credentials:
- Username: `ipek.svs`
- Password: `123`

## 📂 Project Structure

- src/
├── model/
│ ├── Book.java
│ ├── Movie.java
│ ├── Material.java (abstract)
│ ├── Person.java
│ ├── User.java
│ ├── Category.java
│ └── Netflix.java
└── Main.java

## 👩‍💻 Developer

İpek Savaş  
This project was developed for practicing Java and object-oriented design principles.
