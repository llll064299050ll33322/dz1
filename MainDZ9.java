//Задание 1


class Animal {
   public String name;
   public String type;


    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void displayInfo() {
        System.out.println(getAnimal());
    }


    public String getAnimal() {
        return "Это " + type + " по имени " + name;
    }
}



//Задание 2

//class Library {
//    private String[] books;
//    private int bookCount;
//
//    public Library(int capacity) {
//        books = new String[capacity];
//        bookCount = 0;
//    }
//
//
//    public boolean addBook(String bookTitle) {
//        if (bookCount < books.length) {
//            books[bookCount] = bookTitle;
//            bookCount++;
//            return true;
//        } else {
//            System.out.println("Библиотека заполнена, нельзя добавить больше книг");
//            return false;
//        }
//    }
//
//
//    public void displayAllBooks() {
//        if (bookCount == 0) {
//            System.out.println("В библиотеке нет книг");
//            return;
//        }
//
//        System.out.println("Список всех книг в библиотеке:");
//        for (int i = 0; i < bookCount; i++) {
//            System.out.println((i + 1) + ". " + books[i]);
//        }
//    }
//
//
//    public String findBook(String bookTitle) {
//        for (int i = 0; i < bookCount; i++) {
//            if (books[i].equalsIgnoreCase(bookTitle)) {
//                return "Книга '" + bookTitle + "' найдена";
//            }
//        }
//        return "Книга '" + bookTitle + "' не найдена";
//    }
//
//
//    public int getBookCount() {
//        return bookCount;
//    }
//
//}



//Задание 3
//public class Book {
//    private String title;
//    private String author;
//
//
//    public Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//    }
//
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    @Override
//    public String toString() {
//        return "'" + title + "' автор: " + author;
//    }
//
//}

//Задание 3 обновленное
//class Library2 {
//    private Book[] books;
//    private int bookCount;
//
//
//    public Library2(int capacity) {
//        books = new Book[capacity];
//        bookCount = 0;
//    }
//
//
//    public boolean addBook(String title, String author) {
//        if (bookCount < books.length) {
//            books[bookCount] = new Book(title, author);
//            bookCount++;
//            return true;
//        } else {
//            System.out.println("Библиотека заполнена, нельзя добавить больше книг");
//            return false;
//        }
//    }
//
//
//    public void displayAllBooks() {
//        if (bookCount == 0) {
//            System.out.println("В библиотеке нет книг");
//            return;
//        }
//
//        System.out.println("Список всех книг в библиотеке:");
//        for (int i = 0; i < bookCount; i++) {
//            System.out.println((i + 1) + ". " + books[i]);
//        }
//    }
//
//
//    public String findBook(String bookTitle) {
//        for (int i = 0; i < bookCount; i++) {
//            if (books[i].getTitle().equalsIgnoreCase(bookTitle)) {
//                return "Книга '" + bookTitle + "' найдена";
//            }
//        }
//        return "Книга '" + bookTitle + "' не найдена";
//    }
//
//
//    public String findAuthorByTitle(String bookTitle) {
//        for (int i = 0; i < bookCount; i++) {
//            if (books[i].getTitle().equalsIgnoreCase(bookTitle)) {
//                return "Автор книги '" + bookTitle + "': " + books[i].getAuthor();
//            }
//        }
//        return "Книга '" + bookTitle + "' не найдена в библиотеке";
//    }
//
//
//    public int getBookCount() {
//        return bookCount;
//    }
//
//}

//Вывод
//public class MainDZ9 {
//    public static void main(String[] args) {
//
//        Animal animal1 = new Animal("Барсик", "кот");
//        Animal animal2 = new Animal("Шарик", "собака");
//
//        animal1.displayInfo();
//        System.out.println(animal2.getAnimalDescription());
//
//
//        Library stringLibrary = new Library(5);
//        stringLibrary.addBook("Война и мир");
//        stringLibrary.addBook("Преступление и наказание");
//        stringLibrary.displayAllBooks();
//        System.out.println(stringLibrary.findBook("Война и мир"));
//        System.out.println(stringLibrary.findBook("Мастер и Маргарита"));
//
//
//
//        Library bookLibrary = new Library(5);
//        bookLibrary.addBook("Война и мир", "Лев Толстой");
//        bookLibrary.addBook("Преступление и наказание", "Федор Достоевский");
//        bookLibrary.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));
//
//        bookLibrary.displayAllBooks();
//        System.out.println(bookLibrary.findBook("Мастер и Маргарита"));
//        System.out.println(bookLibrary.findAuthorByTitle("Война и мир"));
//        System.out.println(bookLibrary.findAuthorByTitle("Евгений Онегин"));
//    }
//}

