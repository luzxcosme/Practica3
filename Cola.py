class Cola:
    def __init__(self, n):
        self.n = n  
        self.arreglo = [0] * n 
        self.inicio = 0  
        self.fin = -1  

    def insert(self, e):
        if self.is_full():
            print("Cola llena")
        else:
            if self.fin == self.n - 1:
                self.fin = -1 
            self.fin += 1
            self.arreglo[self.fin] = e  

    def remove(self):
        if self.is_empty():
            print("Cola vacia")
            return -1
        else:
            a = self.arreglo[self.inicio]
            self.inicio += 1
            if self.inicio == self.n:
                self.inicio = 0  
            return a

    def peek(self):
        if self.is_empty():
            print("Cola vacia")
            return -1
        else:
            return self.arreglo[self.inicio]

    def is_empty(self):
        return (self.fin + 1 == self.inicio) or (self.inicio + self.n - 1 == self.fin)

    def is_full(self):
        return (self.fin + 2 == self.inicio) or (self.inicio + self.n - 2 == self.fin)

    def size(self):
        if self.fin >= self.inicio:
            return self.fin - self.inicio + 1
        else:
            return (self.n - self.inicio) + (self.fin + 1)



if __name__== "__main__":
    cola = Cola(5)  
    cola.insert(100)
    cola.insert(200)
    cola.insert(300)
    cola.insert(400)

    print(cola.peek())  
    print(cola.remove()) 
    print(cola.remove())  
    print(cola.remove()) 
    print(cola.remove())  
    print(cola.size())
