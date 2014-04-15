package pattern.basic.iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Object> {

	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index =0;
	}

	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

	@Override
	public void remove() {
		System.out.println("지원하지 않습니다.");

	}

}
