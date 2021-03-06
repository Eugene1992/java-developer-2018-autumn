package java_professional.newLinkedList;

import java.util.*;
import java.util.function.Consumer;

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
        index++;
		ListNode nextNode = findNextNode(index);
		ListNode newNode = new ListNode<>(nextNode.previousNode, nextNode, element);
		nextNode.previousNode.nextNode = newNode;
		nextNode.previousNode = newNode;
		this.size++;
	}

	@Override
	public boolean add(E element) {
        this.add(size, element);
		return true;
	}

	@Override
	public boolean addAll(Collection elements) {
        this.addAll(this.size, elements);
		return true;
	}

	@Override
	public boolean addAll(int index, Collection elements) {
		Object[] collection = elements.toArray();
		for (int i = 0; i < collection.length; i++) {
            this.add(index, (E) collection[i]);
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
    public boolean contains(Object element) {
        NewUserLinkedIterator iterator = this.listIterator();
        while (iterator.hasNext()) {
            ListNode currentNode = iterator.nextNode;
            if (currentNode.content.equals(element)) {
                return true;
            }
            iterator.next();
        }
		return false;
	}

	@Override
    public boolean containsAll(Collection elements) {
        Object[] collection = elements.toArray();
        for (int index = 0; index < collection.length; index++) {
            boolean contains = this.contains(collection[index]);
            if (!contains) {
                return false;
            }
        }
        return true;
	}

	@Override
    public E get(int indexReturn) {
        checkIndex(indexReturn);
        ListNode<E> node = this.findNextNode(indexReturn);
        return node.content;
	}

	@Override
    public int indexOf(Object element) {
        NewUserLinkedIterator iterator = this.listIterator();
        while (iterator.hasNext()) {
            ListNode currentNode = iterator.nextNode;
            if (currentNode.content.equals(element)) {
                return iterator.nextIndex;
            }
            iterator.next();
        }
		return 0;
	}

	@Override
	public boolean isEmpty() {
        if (this.FIRST_NODE.nextNode == this.LAST_NODE) {
            return true;
        }
		return false;
	}

    private class NewUserLinkedIterator implements ListIterator<E> {

        private ListNode<E> previousNode;
        private ListNode<E> nextNode;
        private int nextIndex;

        public NewUserLinkedIterator(int nextIndex) {
            if (nextIndex >= size) {
                this.nextIndex = size;
            } else {
                this.nextIndex = nextIndex;
            }
            this.nextNode = findNextNode(nextIndex);
            this.previousNode = this.nextNode.previousNode;
        }

        @Override
        public boolean hasNext() {
            //return this.nextIndex <= size;
            return this.nextNode != LAST_NODE;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                this.previousNode = this.nextNode;
                this.nextNode = this.nextNode.nextNode;
                this.nextIndex++;
                return this.previousNode.content;
            }
        }

        @Override
        public boolean hasPrevious() {
            return this.previousNode != FIRST_NODE;
        }

        @Override
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            } else {
                this.nextNode = this.previousNode;
                this.previousNode = this.previousNode.previousNode;
                this.nextIndex--;
                return this.nextNode.content;
            }
        }

        @Override
        public int nextIndex() {
            return this.nextIndex;
        }

        @Override
        public int previousIndex() {
            return this.nextIndex--;
        }

        @Override
        public void remove() {
            ListNode<E> lastNode = this.previousNode.nextNode;
            this.previousNode.nextNode = this.nextNode;
            lastNode.nextNode = null;
            lastNode.previousNode = null;
            lastNode.content = null;
            this.previousNode.nextNode = this.nextNode;
            nextIndex--;
            size--;
        }

        @Override
        public void set(E element) {
            if (this.nextNode != null) {
                this.nextNode.content = element;
            } else {
                throw new IllegalStateException();
            }
        }

        @Override
        public void add(E element) {
            ListNode newNode = new ListNode(this.nextNode, null, element);
            size++;
            nextIndex++;
        }

        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            while (nextIndex < size) {
                action.accept(nextNode.content);
                previousNode = nextNode;
                nextNode = nextNode.nextNode;
                nextIndex++;
            }
        }
    }

	@Override
    public NewUserLinkedIterator iterator() {
        return new NewUserLinkedIterator(1);
	}

	@Override
    public int lastIndexOf(Object element) {
        NewUserLinkedIterator iterator = this.listIterator(size);
        int lastIndex = size;
        while (iterator.hasPrevious()) {
            ListNode currentNode = iterator.previousNode;
            if (currentNode.content.equals(element)) {
                return lastIndex;
            }
            lastIndex--;
            iterator.previous();
        }
		return 0;
	}

	@Override
    public NewUserLinkedIterator listIterator() {
        return new NewUserLinkedIterator(1);
	}

	@Override
    public NewUserLinkedIterator listIterator(int index) {
        return new NewUserLinkedIterator(index);
	}

	@Override
    public E remove(int index) {
        index++;
        ListNode removeNode = this.findNextNode(index);
        removeNode.previousNode.nextNode = removeNode.nextNode;
        removeNode.nextNode.previousNode = removeNode.previousNode;
        this.size--;
        removeNode.previousNode = null;
        removeNode.nextNode = null;
        removeNode.content = null;
		return null;
	}

	@Override
    public boolean remove(Object element) {
        NewUserLinkedIterator iterator = this.listIterator();
        while (iterator.hasNext()) {
            ListNode currentNode = iterator.nextNode;
            if (currentNode.content.equals(element)) {
                currentNode.previousNode.nextNode = currentNode.nextNode;
                currentNode.nextNode.previousNode = currentNode.previousNode;
                this.size--;
                currentNode.previousNode = null;
                currentNode.nextNode = null;
                currentNode.content = null;
                return true;
            }
            iterator.next();
        }
        return true;
	}

	@Override
    public boolean removeAll(Collection elements) {
        Object[] collection = elements.toArray();
        for (int index = 0; index < collection.length; index++) {
            this.remove(collection[index]);
        }
        return true;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public Object set(int index, Object element) {
        index++;
//        NewUserLinkedIterator iterator = this.listIterator();
//        while (iterator.hasNext()) {
//            if (iterator.nextIndex() == index) {
//                iterator.nextNode.content = (E) element;
//                return iterator.nextNode.content;
//            }
//            iterator.next();
//        }
        ListNode setNode = findNextNode(index);
        setNode.content = (E) element;
        return setNode.content;
	}

	@Override
	public int size() {
        return this.size;
	}

	@Override
    public List subList(int indexBegin, int indexEnd) {
        ListNode beginNode = null;
        ListNode endNode = null;
        checkIndex(indexBegin);
        checkIndex(indexEnd);
        if (indexBegin < indexEnd) {
            beginNode = findNextNode(indexBegin);
            endNode = findNextNode(indexEnd);
        } else {
            beginNode = findNextNode(indexEnd);
            endNode = findNextNode(indexBegin);
        }
        NewUserLinkedList newList = new NewUserLinkedList();
        while (!beginNode.equals(endNode)) {
            newList.add(beginNode.content);
            beginNode = beginNode.nextNode;
        }
        newList.add(beginNode.content);
        return newList;
	}

	@Override
	public Object[] toArray() {
        Object[] newArray = new Object[this.size];
        NewUserLinkedIterator iterator = this.listIterator();
        int arrayIndex = 0;
        while (iterator.hasNext()) {
            newArray[arrayIndex] = iterator.next();
            arrayIndex++;
        }
        return newArray;
	}

	@Override
    public Object[] toArray(Object[] arrayElements) {
        for (int index = 0; index < arrayElements.length; index++) {
            arrayElements[index] = this.get(index + 1);
        }
        return arrayElements;
    }

    private void checkIndex(int index) {
        if (index > this.size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
