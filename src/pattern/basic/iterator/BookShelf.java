package pattern.basic.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Aggregate {

    List list = new ArrayList();


	@Override
	public Iterator<?> iterator() {
		
		return new BookShelfIterator(this);
	}

	public void appendBook(Book book) {
        list.add(book);
	}

	public int getLength() {
		
		return list.size();
	}

	public Book getBookAt(int index) {
		return (Book)list.get(index);
	}

}
