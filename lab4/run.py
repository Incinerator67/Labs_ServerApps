import subprocess
import time

server_process = subprocess.Popen(['python', 'server.py'])
print("Сервер запущен...")

time.sleep(2)

client_process = subprocess.Popen(['python', 'client.py'])
print("Клиент запущен...")

server_process.wait()
client_process.wait()
