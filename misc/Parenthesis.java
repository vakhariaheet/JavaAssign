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
     void display() {
            System.out.println("Title is:" + title);
            System.out.println("Pages is:" + pages);
            System.out.println("Gradelvl is:" + gradeLvl);
            System.out.println("Title is:" + title);
            System.out.println("Pages is:" + pages);
    }
        
};

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("TextBook Object:");
        TextBook tb = new TextBook();
        System.out.println("enter the title");
        String title = sc.nextLine();
        System.out.println("enter the pages");
        int pages = sc.nextInt();
        System.out.println("enter the grade level");
        String gradeLvl = sc.nextLine();
        tb.setTitle(title);
        tb.setPages(pages);
        tb.setGradeLvl(gradeLvl);
        
        System.out.println("\nBook Object:");
        Book b = new Book();
        System.out.println("enter the title for");
        title = sc.nextLine();
        System.out.println("enter pages");
        pages = sc.nextInt();
        b.setTitle(title);
        b.setPages(pages);
    }
   
}