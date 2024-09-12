
# Book and Library Management System

This Java program demonstrates a simple implementation of a book and library management system. It consists of two classes:
- `Book`: Represents a book with attributes such as title, author, and ISBN.
- `Library`: A static inner class within `Book` that manages a collection of `Book` objects.

## Features

- **Book Class**:
  - Represents a book with `title`, `author`, and `ISBN`.
  - Provides getters for these attributes.

- **Library Class**:
  - Manages a collection of `Book` objects.
  - Allows adding and removing books from the library.
  - Lists all books currently in the library.

## Code Structure

- **Book.java**:
  - Contains the `Book` class with attributes and methods to get the book details.
  - Contains the static inner class `Library` for managing books.
  - Contains a `main` method to demonstrate the functionality.

## Usage

1. **Compile the Java file**:
   ```bash
   javac Book.java
   ```

2. **Run the program**:
   ```bash
   java Book
   ```

## Example Output

```
Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 9780743273565
Title: To Kill a Mockingbird, Author: Harper Lee, ISBN: 9780061120084
Title: To Kill a Mockingbird, Author: Harper Lee, ISBN: 9780061120084
```

## Code Explanation

- **Book Class**:
  - **Attributes**: `title`, `author`, `ISBN` - stores the information about the book.
  - **Constructor**: Initializes the `Book` object with title, author, and ISBN.
  - **Getters**: Methods to retrieve the title, author, and ISBN of the book.

- **Library Class** (Static Inner Class):
  - **Attributes**: `books` - an `ArrayList` to store `Book` objects.
  - **Methods**:
    - `addBook(Book book)`: Adds a `Book` to the library.
    - `removeBook(Book book)`: Removes a `Book` from the library.
    - `listBooks()`: Prints the details of all books currently in the library.

- **Main Method**:
  - Creates an instance of `Library`.
  - Adds two books to the library.
  - Lists the books.
  - Removes one book and lists the books again.

## License

This project is open-source and available under the MIT License. Feel free to use and modify the code as needed.

## Contact Information

For any questions or suggestions, please contact:

- **Name**: Yusuf Sani
- **Email**: yusufabdulazizsani@gmail.com
