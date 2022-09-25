package chapter9;

import java.util.function.IntConsumer;
import java.util.function.BinaryOperator;
import java.util.Comparator;


class BookComparator {

	public static void main(String[] args) {
        Book book1 = new Book("String title"," String authorFName", "String authorLName", 10);
        Book book2 = new Book("String title"," String authorFName", "String authorLName", 15);

		Comparator<Book> compareByPageCount = (b1, b2) -> b1.getPages() - b2.getPages();
        BinaryOperator<Book> maxOperator = BinaryOperator.maxBy(compareByPageCount);

		System.out.println("Max: " + maxOperator.apply(book1, book2).getTitle());
    }
}