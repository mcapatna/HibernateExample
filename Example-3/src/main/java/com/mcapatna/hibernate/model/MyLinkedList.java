package com.mcapatna.hibernate.model;

import java.util.Iterator;

/**
 * @since 18 June 2016
 * @author mcapatna The Power House
 *
 */
public class MyLinkedList extends MyList {

	private int MyArrayListId;
	private Object[] toArray;
	private int initialCapacity;
	private int indexOf;
	private String numberOfNullAllowed;
	private String[] timeComplexities;
	private String iteratorType;

	public int getMyArrayListId() {
		return MyArrayListId;
	}

	public void setMyArrayListId(int myArrayListId) {
		MyArrayListId = myArrayListId;
	}

	public Object[] getToArray() {
		return toArray;
	}

	public void setToArray(Object[] toArray) {
		this.toArray = toArray;
	}

	public int getInitialCapacity() {
		return initialCapacity;
	}

	public void setInitialCapacity(int initialCapacity) {
		this.initialCapacity = initialCapacity;
	}

	public int getIndexOf() {
		return indexOf;
	}

	public void setIndexOf(int indexOf) {
		this.indexOf = indexOf;
	}

	public String getNumberOfNullAllowed() {
		return numberOfNullAllowed;
	}

	public void setNumberOfNullAllowed(String numberOfNullAllowed) {
		this.numberOfNullAllowed = numberOfNullAllowed;
	}

	public String[] getTimeComplexities() {
		return timeComplexities;
	}

	public void setTimeComplexities(String[] timeComplexities) {
		this.timeComplexities = timeComplexities;
	}

	public String getIteratorType() {
		return iteratorType;
	}

	public void setIteratorType(String iteratorType) {
		this.iteratorType = iteratorType;
	}

	public MyLinkedList(boolean isEmpty, int size, Object[] toArray, int hashcode, Iterator iterator, int lastIndexOf,
			MyList subList, boolean isOrdered, boolean isSynchronized, boolean isDuplicateAllowed,
			String implementatedClasses, Object[] toArray2, int initialCapacity, int indexOf,
			String numberOfNullAllowed, String[] timeComplexities, String iteratorType) {
		super(isEmpty, size, toArray, hashcode, iterator, lastIndexOf, subList, isOrdered, isSynchronized,
				isDuplicateAllowed, implementatedClasses);
		toArray = toArray2;
		this.initialCapacity = initialCapacity;
		this.indexOf = indexOf;
		this.numberOfNullAllowed = numberOfNullAllowed;
		this.timeComplexities = timeComplexities;
		this.iteratorType = iteratorType;
	}

	

}
