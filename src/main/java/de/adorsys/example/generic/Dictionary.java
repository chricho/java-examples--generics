package de.adorsys.example.generic;

import java.util.Iterator;
import java.util.List;

public class Dictionary<K, V> {

    private final List<Entry<K, V>> entries = new MyArrayList<>();


    public void add(K key, V value) {
        Entry<K, V> entry = new Entry<>();
        entry.key = key;
        entry.value = value;

        entries.add(entry);
    }

    public V get(int index) {
        Entry<K, V> entry = entries.get(index);
        return entry.value;
    }

    public int size() {
        return entries.size();
    }

    public V search(String s) {
        Iterator<Entry<K, V>> carIterator = entries.iterator();

        while(carIterator.hasNext()){
            Entry<K, V> foundEntry = carIterator.next();
            K identifier = foundEntry.key;

            if(identifier.equals(s)){
                return foundEntry.value;
            }
        }

        return null;
    }


    public void remove(String s) {
        Iterator<Entry<K, V>> carIterator = entries.iterator();
        while(carIterator.hasNext()){
            Entry<K, V> foundEntry = carIterator.next();
            K identifier = foundEntry.key;
            if(identifier.equals(s)){
                entries.remove(foundEntry);
            }
        }
    }
}
