package data.structures.openAddressingHashTable;

import java.util.Objects;

public class OpenAddressingHashTable {

  private Entry[] table;

  private int size;

  public OpenAddressingHashTable() {
    this.table = new Entry[10];
    this.size = 0;
  }

  public void put(String key, String value) {
    int index = getIndex(key);

    if (this.table[index] == null) {
      this.table[index] = new Entry(key, value);
      this.size++;

      if (this.size == this.table.length) {
        rehash();
      }
    } else {
      this.table[index].setValue(value);
    }
  }

  private void rehash() {
    Entry[] oldTable = this.table;
    this.table = new Entry[this.table.length * 2];

    for (Entry entry : oldTable) {
      if (entry != null) {
        put(entry.getKey(), entry.getValue());
      }
    }
  }

  public String get(String key) {
    int index = getIndex(key);

    if (this.table[index] == null) {
      return null;
    }

    return this.table[index].getValue();
  }

  private int getIndex(String key) {
    int index = key.hashCode() % this.table.length;

    while (this.table[index] != null
        && !Objects.equals(this.table[index].getKey(), key)) {
      if (index < this.table.length - 1) {
        index++;
      } else {
        index = 0;
      }
    }
    return index;
  }
}
