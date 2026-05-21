package practice3_May20;

public class Book {
    // Поля класса
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;

// констр без параметров
    public Book() {
    }
// констр с параметрами
    public Book(int id, String name, String author, String publisher,
                int yearOfPublication, int numberOfPages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public void info ()
    {
        System.out.println(" Информация о книге ");
        System.out.println("ID: " + id);
        System.out.println("Название: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Издательство: " + publisher);
        System.out.println("Год издания: " + yearOfPublication);
        System.out.println("Количество страниц: " + numberOfPages);
        System.out.println("Цена: " + price + " руб.");
        System.out.println();
    }

    // изменения цены книги
    public void changePrice(double newPrice) {
        System.out.println("Книга " + name + " : цена изменена с " +
                price + " на " + newPrice + " руб.");
        this.price = newPrice;
    }

    //находим более новые книги
    public static Book[] newBook(Book[] books, int year) {
        //находим количество новых книг для инициализации массива
        int count = 0;
        for (Book book : books) {
            if (books[count].yearOfPublication > year) count++;
        }
        //создаем массив нужного размера
        int index = 0;
        Book[] newBooks = new Book[count];
        for (Book book : books) {
            if (book.yearOfPublication > year) {
                newBooks[index] = books[index];
            }
            index++;
        }
        return newBooks;
    }

        //удаляем книгу
        public static Book[] withoutDeletedBook (Book[] books,int id){
            //находим количество новых книг для инициализации массива
            int count = 0;
            for (Book book : books) {
                if (books[count].yearOfPublication != id) count++;
            }
            //создаем массив нужного размера
            int index = 0;
            Book[] newWithoutDeletedBooks = new Book[count];
            for (Book book : books) {
                if (book.yearOfPublication != id) {
                    newWithoutDeletedBooks[index] = books[index];
                }
                index++;
            }
            return newWithoutDeletedBooks;
        }

    }
