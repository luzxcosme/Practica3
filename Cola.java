package cola;
public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;

    public Cola(int n) {
        this.n = n;
        arreglo = new long[n];
        inicio = 0;
        fin = -1;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("Cola llena");
        } else {
            if (fin == n - 1) {
                fin = -1;
            }
            fin++; 
            arreglo[fin] = e; 
        }
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Cola vacia");
            return -1;
        } else {
            long a = arreglo[inicio++];
            if (inicio == n) {
                inicio = 0;
            }
            return a;
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Cola vacia");
            return -1;
        } else {
            return arreglo[inicio];
        }
    }

    public boolean isEmpty() {
        return (fin + 1 == inicio) || (inicio + n - 1 == fin); 
    }

    public boolean isFull() {
        return (fin + 2 == inicio) || (inicio + n - 2 == fin); 
    }

    public int size() {
        if (fin >= inicio) {
            return fin - inicio + 1;
        } else {
            return (n - inicio) + (fin + 1);
        }
    }

    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insert(100);
        cola.insert(200);
        cola.insert(300);
        cola.insert(400);
        System.out.println(cola.peek());
        System.out.println(cola.remove());
        System.out.println(cola.remove());
        System.out.println(cola.remove());
        System.out.println(cola.remove());
        System.out.println(cola.size());
        
    }
}
