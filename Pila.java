package pila;
public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        arreglo = new long[n];
        top = -1;
    }

    public void push(long e) {
        if (isFull()) {
            System.out.println("Pila llena");
        } else {
            arreglo[++top] = e;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("Pila vacia");
            return -1;
        } else {
            return arreglo[top--];
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Pila vacia");
            return -1;
        } else {
            return arreglo[top];
        }
    }

    public boolean isEmpty() {
        return top == -1; 
    }

    public boolean isFull() {
        return top == n - 1; 
    }

    public static void main(String[] args) {
        Pila pila = new Pila(3);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek()); 
        System.out.println(pila.pop());  
        System.out.println(pila.peek()); 
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
}
