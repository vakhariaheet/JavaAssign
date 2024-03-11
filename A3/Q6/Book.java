

import java.util.Scanner;

class Book {
    String title;
    int pages;

    int getPages() {
        return pages;
    }

    String getTitle() {
        return title;
    }
    
    void setTitle(String title) {
        this.title = title;
    }

    void setPages(int pages) {
        this.pages = pages;
    }
};

class TextBook extends Book {
    String gradeLvl;

    void setGradeLvl(String gradeLvl) {
        this.gradeLvl = gradeLvl;
    }

    String getGradeLvl() {
        return gradeLvl;
    }
};

class Init {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TextBook Object:");
        TextBook tb = new TextBook();
        System.out.println("Enter Title: ");
        tb.setTitle(scanner.nextLine());
        System.out.println("Enter Pages: ");
        tb.setPages(scanner.nextInt());
        System.out.println("Enter Grade Level: ");
        tb.setGradeLvl(scanner.next());
        System.out.println("Title: " + tb.getTitle());
        System.out.println("Pages: " + tb.getPages());
        System.out.println("Grade Level: " + tb.getGradeLvl());
    
        System.out.println("\nBook Object:");
        Book b = new Book();
        System.out.println("Enter Title: ");
        b.setTitle(scanner.nextLine());
        System.out.println("Enter Pages: ");
        b.setPages(scanner.nextInt());
        System.out.println("Title: " + b.getTitle());
        System.out.println("Pages: " + b.getPages());

    }
}
