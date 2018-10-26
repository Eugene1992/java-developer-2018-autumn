package java_professional.newLinkedList;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class NewUserLinkedList<E> implements List<E> {

    private int size;
    private final ListNode FIRST_NODE = new ListNode();
    private final ListNode LAST_NODE = new ListNode();

    public NewUserLinkedList() {
        this.size = 0;
		this.FIRST_NODE.nextNode = this.LAST_NODE;
		this.LAST_NODE.previousNode = this.FIRST_NODE;
    }

    private class ListNode<E> {
        private ListNode previousNode;
        private ListNode nextNode;
        private E content;

        public ListNode(ListNode previousNode, ListNode nextNode, E content) {
            this.previousNode = previousNode;
            this.nextNode = nextNode;
            this.content = content;
        }

        public ListNode() {
        }

        public ListNode getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(ListNode previousNode) {
            this.previousNode = previousNode;
        }

        public ListNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(ListNode nextNode) {
            this.nextNode = nextNode;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(E content) {
            this.content = content;
        }
    }

	public int getSize() {
		return size;
	}

	private ListNode findNextNode(int index) {
		if (index > this.size / 2) {
			ListNode nextNode = this.LAST_NODE;
			for (int i = size; i >= index; i--) {
				nextNode = nextNode.previousNode;
			}
			return nextNode;
		} else {
			ListNode nextNode = this.FIRST_NODE;
			for (int i = 1; i <= index; i++) {
				nextNode = nextNode.nextNode;
			}
			return nextNode;
		}
	}

	@Override
	public void add(int index, E element) {
		ListNode nextNode = findNextNode(index);
		ListNode newNode = new ListNode<>(nextNode.previousNode, nextNode, element);
		nextNode.previousNode.nextNode = newNode;
		nextNode.previousNode = newNode;
		this.size++;
	}

	@Override
	public boolean add(E element) {
		this.add(size + 1, element);
		return true;
	}

	@Override
	public boolean addAll(Collection elements) {
		this.addAll(this.size + 1, elements);
		return true;
	}

	@Override
	public boolean addAll(int index, Collection elements) {
		Object[] collection = elements.toArray();
		for (int i = 0; i < collection.length; i++) {
			this.add(index + i, (E) collection[i]);
		}
		return true;
	}

	@Override
	public void clear() {
		ListNode checkNode = this.LAST_NODE.previousNode;
		while (checkNode.previousNode != null) {
			ListNode deleteNode = checkNode;
			checkNode = deleteNode.previousNode;
			deleteNode.previousNode = null;
			deleteNode.nextNode = null;
			deleteNode.content = null;
		}
		this.size = 0;
		this.LAST_NODE.previousNode = this.FIRST_NODE;
		this.FIRST_NODE.nextNode = this.LAST_NODE;
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

   
}
