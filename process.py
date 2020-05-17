# Python code to create child process
import os  # Importar o módulo "os" que traz informações sobre o sistema operacional
from datetime import datetime

n = os.fork()  #põe a função fork em uma variável 
# n é maior que 0, significa que o processo é "pai". 
if n > 0:
    print("Parent process id is : ", os.getpid())  # informa qual é o processo e seu id
# se n for igual a 0, significa que o processo é "filho".
else: 
    print("Child process id is : ", os.getpid())  # informa qual é o processo e seu id

print(datetime.now())