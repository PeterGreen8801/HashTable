public class HashTable //extends LinkedList
{
   private int tableSize = 10;
   static LinkedList[] hashTable;
   HashTable()
   {
      hashTable = new LinkedList[tableSize];
      for(int i = 0; i < tableSize; i++)
      {
         hashTable[i] = new LinkedList();
         //hashTable[i] = null;
      }
   }
   static class Node
   {  
      int value;
      Node next;
      Node(int val)
      {
         value = val;
         next = null;
      }
      
   }
   public static void insert(int val)
   {
      LinkedList tempLL = new LinkedList();
      int index = hashFunction(val);
      tempLL = hashTable[index];
      hashTable[index].value = val;
   }
   
   public static int hashFunction(int val)
   {
      return (val % 10);
   }
   public static void dumpHash()
   {
      for(int i = 0;i < hashTable.length;i++)
      {
         System.out.println(hashTable[i].value);
      }
   }
   public static void main(String[] args)
   {
     HashTable hash = new HashTable();
     insert(6);
     insert(14);
     dumpHash();
   }
}