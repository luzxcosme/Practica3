class Pila:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.top = -1

    def push(self, e):
        if self.is_full():
            print("Pila llena")
        else:
            self.top += 1
            self.arreglo[self.top] = e

    def pop(self):
        if self.is_empty():
            print("Pila vacia")
            return -1
        else:
            elemento = self.arreglo[self.top]
            self.top -= 1
            return elemento

    def peek(self):
        if self.is_empty():
            print("Pila vacia")
            return -1
        else:
            return self.arreglo[self.top]

    def is_empty(self):
        return self.top == -1

    def is_full(self):
        return self.top == self.n - 1




if __name__ == "__main__":
    pila = Pila(3)
    pila.push(10)
    pila.push(20)
    pila.push(30)
    print(pila.peek())  
    print(pila.pop())   
    print(pila.peek())  
    print(pila.pop())   
    print(pila.pop())
    print(pila.pop())
