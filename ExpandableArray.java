package com.meritamerica.stacks;

    /**
     * This class provides methods for working with an array that expands to include
     * any positive index value supplied by the caller.
     */
    public class ExpandableArray {

        private Object[] myList;

        /**
         * Creates a new expandable array with no elements.
         */
        public ExpandableArray() {

            myList = new Object[0];
        }

        /**
         * Sets the element at the given index position to the specified. value. If the
         * internal array is not large enough to contain that element, the
         * implementation expands the array to make room.
         */
        public void set(int index, Object value) {
            
            if (index < myList.length) {

                myList[index] = value;
                
            } else {
                // back up old list
                
                Object myOldList[] = new Object[myList.length];
                for (int i = 0; i < myOldList.length; i++) {
                    myOldList[i] = myList[i];
                    
                }
                // create a new list larger than the old one
                
                myList = new Object[index+1];

                // copy elements from back up old list to new one
                
                for (int j = 0; j < myOldList.length; j++) {
                    myList[j] = myOldList[j];
                    
                }

                // complete new list with rest of elements
                
                for (int k = myOldList.length; k < index + 1; k++) {
                    myList[k] = null;
            
                }
                
                myList[index] = value;
              
            }
        }

        /**
         * Returns the element at the specified index position, or null if no such
         * element exists. Note that this method never throws an out-of-bounds
         * exception; if the index is outside the bounds of the array, the return value
         * is simply null.
         */
        public Object get(int index) {
            
            if (index <= myList.length)
                return myList[index];
            return null;
        }

    }

