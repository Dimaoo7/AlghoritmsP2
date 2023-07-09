package pro.sky.alghoritmsp2;

public class IntegerListImpl implements IntegerList {

     public Integer[] storage = new Integer[10];

    @Override
    public Integer add(Integer item) {
        if (storage.length == 0) {
            storage[0] = item;
            return item;
        }
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = item;
                return item;
            }
        }
        if (storage.length == 10) {
            grow();
        }
        return null;
    }

    @Override
    public Integer remove(Integer item) {
        if (storage.length == 0) {
            return null;
        }
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == item) {
                for (int j = i; j < storage.length - 1; j++) {
                    storage[j] = storage[j + 1];
                }
                storage[storage.length - 1] = null;
                return item;
            }
        }
        return null;
    }

    //Изменить реализацию сортировки на рекурсивную из последней шпаргалки.
    //
    //Выбор конкретной сортировки лежит на вас.

    public void quickSort(Integer[] arr, int begin, int end) {

        if (begin < end) {
            int pivot = partition(arr, begin, end);
            quickSort(arr, begin, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                swapElements(arr, i, j);
            }
        }

        swapElements(arr, i + 1, end);
        return i + 1;
    }

    private static void swapElements(Integer[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


    @Override
    public Integer size() {
        return storage.length;
    }

    @Override
    public boolean isEmpty() {
        return storage.length == 0;
    }

    @Override
    public void clear() {
        storage = new Integer[10];
    }

    public void grow(){
        int newSize = storage.length + 5;
        Integer[] newStorage = new Integer[newSize];
        System.arraycopy(storage, 0, newStorage, 0, storage.length);
        storage = newStorage;
    }
}

