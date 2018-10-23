package java_professional.homeworks.homework01.hashmap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V> implements Map<K,V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private static final int DEFAULT_THRESHOLD = (int) (DEFAULT_CAPACITY * DEFAULT_LOAD_FACTOR);


    public Node<K,V>[] table;
    private int threshold;
    private double loadFactor = DEFAULT_LOAD_FACTOR;
    private int size = 0;


    /**
     *  Конструктор по умолчанию создает HashMap дефолтной вместимости 16.
     *  Количество порогового заполнения также задаеться дефолтным значением
     *  DEFAULT_LOAD_FACTOR * DEFAULT_CAPACITY
     */
    MyHashMap(){
        this.threshold = (int) (DEFAULT_CAPACITY * loadFactor);
        this.table = new Node[DEFAULT_CAPACITY];
    }

    private MyHashMap(int oldTableLength){
        this.table = new Node[oldTableLength * 2];
        this.threshold = (int) (table.length * loadFactor);
    }


    /**
     *  Метод, который возвращает размер MyHashMap
     */
    @Override
    public int size() {
        return size;
    }

    /**
     *  Метод, который проверяет пустая ли HashMap
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     *  Метод, проверяющий есть ли такой ключ в HashMap
     */
    @Override
    public boolean containsKey(Object key) {
        if (key == null) {
            return false;
        }
        int bucketIndex = hash((K) key) % table.length;
        Iterator<K> iterator = new BucketIterator(bucketIndex);
        while(((BucketIterator) iterator).current != null){
            if(((BucketIterator) iterator).current.getKey().equals(key)){
                return true;
            }
            iterator.next();
        }
        return false;
    }


    /**
     *  Метод, проверяющий есть ли значение ключ HashMap
     */
    @Override
    public boolean containsValue(Object value) {
        if (value == null) {
            return false;
        }
        for (int i = 0; i < table.length; i++) {
            Iterator<K> iterator = new BucketIterator(i);
            while(((BucketIterator) iterator).current != null){
                if(((BucketIterator) iterator).current.getValue().equals(value)){
                    return true;
                }
                iterator.next();
            }
        }
        return false;
    }


    /**
     *  Метод, для получения значения элемента по ключу
     */
    @Override
    public V get(Object key) {
        if(key == null){
            return null;
        }
        int bucketIndex = hash((K) key) % table.length;
        Iterator iterator = new BucketIterator(bucketIndex);
        while(((BucketIterator) iterator).current != null) {
            if(((BucketIterator) iterator).current.getKey().equals(key)){
                return ((BucketIterator) iterator).current.getValue();
            }
            iterator.next();
        }
        return null;
    }


    /**
     *  Метод, который добавляет элемент в HashMap
     */
    @Override
    public V put(K key, V value) {
        if(key == null || value == null){
            return null;
        }
        resize();
        Node<K,V> newNode = new Node(key, value, hash(key));
        int bucketIndex = hash(key) % table.length;
        //System.out.println(bucketIndex);
        if(table[bucketIndex] == null){
            table[bucketIndex] = newNode;
            size++;
        }
        else{
            Iterator iterator = new BucketIterator(bucketIndex);
            Node<K,V> current = ((BucketIterator) iterator).current;
            while(((BucketIterator) iterator).current != null){
                if(current.getKey().equals(key)){
                    ((BucketIterator) iterator).current.setValue(value);
                    return ((BucketIterator) iterator).current.getValue();
                }
                if(current.next == null){
                    break;
                }
                iterator.next();
                current = ((BucketIterator) iterator).current;
            }
            current.next = newNode;
            size++;
        }

        return newNode.getValue();
    }



    /**
     *  Метод, для удаления элемента из HashMap
     */
    @Override
    public V remove(Object key) {
        if(key == null || !containsKey(key)){
            return null;
        }
        int bucketIndex = hash((K) key) % table.length;
        Iterator<K> iterator = new BucketIterator(bucketIndex);
        Node<K,V> deletedNode = null;
        //удаление ноды из начала корзины
        if(((BucketIterator) iterator).current.getKey().equals(key)){
            size--;
            V value = ((BucketIterator) iterator).current.getValue();
            iterator.next();
            Node<K,V> afterDeletedNode = ((BucketIterator) iterator).current;
            table[bucketIndex] = afterDeletedNode;
            return value;
        }

        //удаление ноды не из начала корзины
        Node<K,V> preDeletedNode = null;
        while(((BucketIterator) iterator).current != null){
            preDeletedNode = ((BucketIterator) iterator).current;
            iterator.next();
            if(((BucketIterator) iterator).current == null){
                return null;
            }
            if(((BucketIterator) iterator).current.getKey().equals(key)) {
                deletedNode = ((BucketIterator) iterator).current;
                break;
            }
        }
        Node<K,V> afterDeletedNode = ((BucketIterator) iterator).current.next;
        preDeletedNode.next = afterDeletedNode;
        size--;
        return deletedNode.value;
    }



    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    /**
     *  Метод, для полной очистки HashMap
     */
    @Override
    public void clear() {
        table = null;
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    /**
     * Метод для вычесления хеша Node
     */
    public int hash(K key){
        int hash = 31;
        hash = hash * 17 + key.hashCode();
        if(hash < 0){
            hash *= -1;
        }
        return hash;
    }

    /**
     *  Метод, который выводит HashMap
     */
    @Override
    public String toString(){
        if(size == 0){
            return "[]";
        }
        String res = "[\n";
        int counter = size;
        for (int i = 0; i < table.length; i++) {
            if(table[i] != null) {
                Iterator iterator = new BucketIterator(i);
                while (((BucketIterator) iterator).current != null) {
                    Node<K, V> node = ((BucketIterator) iterator).current;
                    res += node.toString();
                    counter--;
                    if(counter != 0){
                        res += ", ";
                    }
                    iterator.next();
                }
                res += "\n";
            }
        }
        res += "]";
        return res;
    }


    /**
     *  Метод, для разширения HashMap в случае перехода порога допустимого
     *  количества элементов
     */
    public void resize(){
        if((size + 1) > threshold){
            MyHashMap<K,V> resizedHashMap = new MyHashMap<>(table.length);
            for (int i = 0; i < table.length; i++) {
                Iterator<K> iterator = new BucketIterator(i);
                while(((BucketIterator) iterator).current != null){
                    Node<K,V> node = ((BucketIterator) iterator).current;
                    resizedHashMap.put(node.getKey(), node.getValue());
                    iterator.next();
                }
            }
            System.out.println("HashMap разширяеться!!!!!");
            table = resizedHashMap.table;
            threshold = resizedHashMap.threshold;
        }
    }



    /**
     * Вспомагательный клас для хранения элементов HashMap.
     * Каждая Node содержит ключ, значение, хеш єлемента и ссылку
     * на следующий элемент в этой же корзине.
     */
    public class Node<K,V> implements Map.Entry<K,V> {
        final int hash;     //поле для хеша
        final K key;        //поле ключа ноды
        V value;            //поле значения ноды
        Node<K,V> next;     //поле отсылка на следующую ноду


        /**
         * Конструктор для создания Node по ключу и значению
         */
        Node(K key, V value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = null;
        }

        /**
         * Метод для получения ключа элемента
         */
        @Override
        public final K getKey(){
            return key;
        }

        /**
         * Метод для получения значения элемента
         */
        @Override
        public final V getValue() {
            return value;
        }

        /**
         * Метод для задавания значения элемента
         */
        @Override
        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }


        /**
         * Метод для вывода элемента(его ключа и значения)
         */
        @Override
        public final String toString() {
            return key + " = " + value;
        }

    }





    /**
     * Клас итератора для bucket в HashMap
     */
    private class BucketIterator implements Iterator<K> {
        private Node<K,V> current;      //необходим для итерации по корзине


        /**
         * Конструктор итератора для корзины.
         * Индекс задает номер корзины, по списку элементов которой будем итерировать
         */
        BucketIterator(int index){
            current = table[index];
        }

        /**
         * Метод для проверки есть ли у после данного элемента еще элемент
         */
        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        /**
         * Метод для перехода на следующий элемент списка
         */
        @Override
        public K next() {
            Node<K,V> node = current;
            current = current.next;
            return node.getKey();
        }
    }
}
