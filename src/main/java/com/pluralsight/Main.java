package com.pluralsight;


import java.util.Scanner;

public static void main(String[] args) {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Library library = new Library();

            library.addBook(new Book("The Hobbit by J.R.R. Tolkien");
            library.addBook(new Book("1984 by George Orwell");
            library.addBook(new Book("To Kill a Mockingbird by Harper Lee");
            library.addBook(new Book("The Night Circus by Erin Morgenstern");
            library.addBook(new Book("Where the Crawdads Sing by Delia Owens");
            library.addBook(new Book("The Great Gatsby by F. Scott Fitzgerald");
            library.addBook(new Book("The Girl with the Dragon Tattoo by Stieg Larsson");
            library.addBook(new Book("Big Little Lies by Liane Moriarty");
            library.addBook(new Book("he Name of the Wind y Patrick Rothfuss";
            library.addBook(new Book(" Court of Thorns and Roses bySarah J. Maas");
            library.addBook(new Book("Dune by Frank Herbert");
            library.addBook(new Book("The Martian by Andy Weir");
            library.addBook(new Book("The Book Thief by Markus Zusak");
            library.addBook(new Book("The Nightingale by Kristin Hannah");
            library.addBook(new Book("Educated by Tara Westover");
            library.addBook(new Book("Sapiens: A Brief History of Humankind");

            public Book checkOutBook(int id) {
                for (Book book : books) {
                    if (book.getId() = book.isCheckedOut(){
                        book.checkOut();
                        return book;
                    }


                    public void listBooks() {
                        for (Book book : books) {
                            String status = book.isCheckedOut() ? "Checked Out" : "Available";
                            System.out.println(book.getId() + ". " + book.getTitle() + " by " + book.getAuthor() + " - " + status);
                        }

                        while (true) {
                            System.out.println("\nWelcome to the Neighborhood Library!");
                            System.out.println("1. Show Availible Books");
                            System.out.println("2. Show Checked Out Book");
                            System.out.println("3. Exit");

                            int choice = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character

                            switch (choice) {
                                case 1:
                                    library.listBooks();
                                    break;
                                case 2:
                                    library.listCheckedOutBooks();
                                    break;
                                case 3:
                                    library.listBooks();
                                    System.out.print("Enter the ID of the book you want to check out: ");
                                    int bookId = scanner.nextInt();
                                    scanner.nextLine();

                                    // Ask for the user's name
                                    System.out.print("Enter your name: ");
                                    String userName = scanner.nextLine();

                                    // Check out the book
                                    Book checkedOutBook = library.checkOutBook(bookId);
                                    if (checkedOutBook != null) {
                                        System.out.println(userName + ", You checked out: " + checkedOutBook.getTitle());
                                    } else {
                                        System.out.println("Book is checked out.");
                                    }
                                    break;

                                default:
                                    System.out.println("Go back to home screen");
                            }








                        }

                    }
                }
            }
        }
    }
}

