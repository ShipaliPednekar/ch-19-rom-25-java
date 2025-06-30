class Library {
public static void main(String[] args) {
   String bookNames[] = {"To Kill a Mockingbird","1984","Pride and Prejudice","The Great Gatsby", "Harry Potter and the Sorcerer's Stone","The Hobbit","The Alchemist","The Catcher in the Rye" };
   
System.out.println("Books available in library");

for(String bookName : bookNames){ 
System.out.println(bookName);
}
  
  
    //System.out.println(bookNames[0] + " " + bookNames[1] + " " + bookNames[2] + " " + bookNames[3] + " " + bookNames[4] + " " + bookNames[5] + " " + bookNames[6] + " " + bookNames[7]);
  }
}
