package com.mcapatna.hibernate.model;

import java.util.Iterator;

/**
 * @since 18 June 2016
 * @author mcapatna The Power House
 *
 */
public class MyList extends MyCollection {
	private Iterator iterator;
	private int MyListId;
	private int lastIndexOf;
	private MyList subList;
	private boolean isOrdered;
	private boolean IsSynchronized;
	private boolean IsDuplicateAllowed;
	private String implementatedClasses;

	public Iterator getIterator() {
		return iterator;
	}

	public void setIterator(Iterator iterator) {
		this.iterator = iterator;
	}

	public int getMyListId() {
		return MyListId;
	}

	public void setMyListId(int myListId) {
		MyListId = myListId;
	}

	public int getLastIndexOf() {
		return lastIndexOf;
	}

	public void setLastIndexOf(int lastIndexOf) {
		this.lastIndexOf = lastIndexOf;
	}

	public MyList getSubList() {
		return subList;
	}

	public void setSubList(MyList subList) {
		this.subList = subList;
	}

	public boolean isOrdered() {
		return isOrdered;
	}

	public void setOrdered(boolean isOrdered) {
		this.isOrdered = isOrdered;
	}

	public boolean isIsSynchronized() {
		return IsSynchronized;
	}

	public void setIsSynchronized(boolean isSynchronized) {
		IsSynchronized = isSynchronized;
	}

	public boolean isIsDuplicateAllowed() {
		return IsDuplicateAllowed;
	}

	public void setIsDuplicateAllowed(boolean isDuplicateAllowed) {
		IsDuplicateAllowed = isDuplicateAllowed;
	}

	public String getImplementatedClasses() {
		return implementatedClasses;
	}

	public void setImplementatedClasses(String implementatedClasses) {
		this.implementatedClasses = implementatedClasses;
	}

	public MyList(boolean isEmpty, int size, Object[] toArray, int hashcode, Iterator iterator, int lastIndexOf,
			MyList subList, boolean isOrdered, boolean isSynchronized, boolean isDuplicateAllowed,
			String implementatedClasses) {
		super(isEmpty, size, toArray, hashcode);
		this.iterator = iterator;
		this.lastIndexOf = lastIndexOf;
		this.subList = subList;
		this.isOrdered = isOrdered;
		IsSynchronized = isSynchronized;
		IsDuplicateAllowed = isDuplicateAllowed;
		this.implementatedClasses = implementatedClasses;
	}

}
