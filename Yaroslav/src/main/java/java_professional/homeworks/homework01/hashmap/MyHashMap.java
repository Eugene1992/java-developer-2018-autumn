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
        this.threshold = (int) (DEFAULT_LOAD_FACTOR * loadFactor);
        this.table = new Node[DEFAULT_CAPACITY];
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


    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }


    /**
     *  Метод, который добавляет элемент в HashMap
     */
    @Override
    public V put(K key, V value) {
        Node<K,V> newNode = new Node(key, value);
        int bucketIndex = newNode.hash();
        //System.out.println(bucketIndex);
        if(table[bucketIndex] == null){
            table[bucketIndex] = newNode;
            size++;
        }
        else{
            Iterator iterator = new BucketIterator(bucketIndex);
            Node<K,V> current = ((BucketIterator) iterator).getCurrent();
            while(iterator.hasNext()){
                iterator.next();
                current = ((BucketIterator) iterator).getCurrent();
            }
            current.next = newNode;
            size++;
        }

        return newNode.getValue();
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

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
     *  Метод, который выводит HashMap
     */
    @Override
    public String toString(){
        String res = "[";
        int counter = size;
        for (int i = 0; i < table.length; i++) {
            if(table[i] != null) {
                Iterator iterator = new BucketIterator(i);
                while (((BucketIterator) iterator).getCurrent() != null) {
                    Node<K, V> node = ((BucketIterator) iterator).getCurrent();
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
     * Вспомагательный клас для хранения элементов HashMap.
     * Каждая Node содержит ключ, значение, хеш єлемента и ссылку
     * на следующий элемент в этой же корзине.
     */
    private class Node<K,V> implements Map.Entry<K,V> {
        final int hash;     //поле для хеша
        final K key;        //поле ключа ноды
        V value;            //поле значения ноды
        Node<K,V> next;     //поле отсылка на следующую ноду


        /**
         * Конструктор для создания Node по ключу и значению
         */
        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.hash = hash();
            this.next = null;
        }

        /**
         * Метод для вычесления хеша Node
         */
        public int hash(){
            int hash = 31;
            hash = hash * 17 + key.hashCode();
            hash = hash * 17 + value.hashCode();
            if(hash < 0){
                hash *= -1;
            }
            return hash % table.length;
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

        /**
         * Метод для получения элемента, на котором сейчас находиться
         * current.(current необходим для итерации по списку в корзине)
         */
        public Node<K,V> getCurrent(){
            return  current;
        }
    }
}
