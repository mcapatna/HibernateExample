package com.mcapatna.hibernate.model;

/**
 * @since 18 June 2016
 * @author mcapatna The Power House
 *
 */
public class MyCollection {
	private boolean IsEmpty;
	private int size;
	private Object[] toArray;
	int hashcode;
	private int collectionId;

	public int getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(int collectionId) {
		this.collectionId = collectionId;
	}

	public boolean isIsEmpty() {
		return IsEmpty;
	}

	public void setIsEmpty(boolean isEmpty) {
		IsEmpty = isEmpty;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Object[] getToArray() {
		return toArray;
	}

	public void setToArray(Object[] toArray) {
		this.toArray = toArray;
	}

	public int getHashcode() {
		return hashcode;
	}

	public void setHashcode(int hashcode) {
		this.hashcode = hashcode;
	}

	public MyCollection(boolean isEmpty, int size, Object[] toArray, int hashcode) {
		super();
		IsEmpty = isEmpty;
		this.size = size;
		this.toArray = toArray;
		this.hashcode = hashcode;
	}

}
