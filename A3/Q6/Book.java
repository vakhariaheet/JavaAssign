package A3.Q6;

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

class Main {
    public static void main(String[] args) {
        System.out.println("TextBook Object:");
        TextBook tb = new TextBook();
        tb.setTitle("Math");
        tb.setPages(100);
        tb.setGradeLvl("10th");
        System.out.println("Title: " + tb.getTitle());
        System.out.println("Pages: " + tb.getPages());
        System.out.println("Grade Level: " + tb.getGradeLvl());

        System.out.println("\nBook Object:");
        Book b = new Book();
        b.setTitle("Science");
        b.setPages(200);
        System.out.println("Title: " + b.getTitle());
        System.out.println("Pages: " + b.getPages());

    }
}
