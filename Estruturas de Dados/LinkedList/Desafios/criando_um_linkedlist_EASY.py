# A solucao deve estar implementada dentro da função abaixo.
# Dica: Você pode criar outras funções e classes se quiser mas esta é a função principal que será usada.

class Node:
    def __init__(self, value):
        self.next = None
        self.value = value


class LinkedList:
    def __init__(self):
        self.headList = None

    def insert_node_to_tail(self, node):
        if not self.headList:
            self.headList = node
        else:
            current = self.headList
            if current.next:  
                while current.next:
                    current = current.next
            current.next = node

    def insert_node_to_head(self, node):
        if not self.headList:
            self.headList = node
        else:
            node.next = self.headList
            self.headList = node

    def is_empty(self):
        if not self.headList:
            return True
        else:
            return False

    def head(self):
        return self.headList

    def tail(self):
        tail = self.headList
        if not tail.next:
            return tail
        else:
            while tail.next:
                tail = tail.next
            return tail
        
        
# faltam 3, quase lá
# falta 1!!
# consegui!!!
# fazer em Java agora