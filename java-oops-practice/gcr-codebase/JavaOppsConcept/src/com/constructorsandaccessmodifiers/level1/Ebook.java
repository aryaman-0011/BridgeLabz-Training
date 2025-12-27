package com.constructorsandaccessmodifiers.level1;

class EBook extends Books {

    String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    void displayDetails() {
        System.out.println(
            "ISBN: " + ISBN +            // public
            ", Title: " + title +        // protected
            ", Format: " + fileFormat +
            ", Author: " + getAuthor()   // private via getter
        );
    }

    public static void main(String[] args) {

        EBook ebook = new EBook(
            "978-0134685991",
            "Effective Java",
            "Joshua Bloch",
            "PDF"
        );

        ebook.displayDetails();

        // Modify private author using setter
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
