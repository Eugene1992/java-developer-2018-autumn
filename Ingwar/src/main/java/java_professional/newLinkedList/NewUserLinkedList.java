package java_professional.newLinkedList;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class NewUserLinkedList extends AbstractSequentialList implements List {

    private int size;
    private final listNode FIRSTNODE = new listNode(this);
    private final listNode LASTNODE = new listNode(this);

    public NewUserLinkedList() {
    }

    private class listNode {
        private listNode previousNode;
        private listNode nextNode;
        private Object content;
        private NewUserLinkedList nodeList;

        public listNode(listNode previousNode, listNode nextNode, Object content, NewUserLinkedList nodeList) {
            this.previousNode = previousNode;
            this.nextNode = nextNode;
            this.content = content;
            this.nodeList = nodeList;
        }

        public listNode(NewUserLinkedList nodeList) {
            this.nodeList = nodeList;
        }

        public listNode getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(listNode previousNode) {
            this.previousNode = previousNode;
        }

        public listNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(listNode nextNode) {
            this.nextNode = nextNode;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }

        public NewUserLinkedList getNodeList() {
            return nodeList;
        }

        public void setNodeList(NewUserLinkedList nodeList) {
            this.nodeList = nodeList;
        }
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {

    }

    @Override
    public void sort(Comparator c) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return false;
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }
}
