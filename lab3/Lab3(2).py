import threading
import time

counter = 0
counter_lock = threading.Lock()

def increment_counter():
    global counter
    for _ in range(100000):
        with counter_lock:
            local_counter = counter
            local_counter += 1
            counter = local_counter

def decrement_counter():
    global counter
    for _ in range(100000):
        with counter_lock:
            local_counter = counter
            local_counter -= 1
            counter = local_counter

def main(n, m):
    global counter
    counter = 0

    threads = []

    for _ in range(n):
        t = threading.Thread(target=increment_counter)
        threads.append(t)
        t.start()

    for _ in range(m):
        t = threading.Thread(target=decrement_counter)
        threads.append(t)
        t.start()

    for t in threads:
        t.join()

    print(f"Final counter value: {counter}")

if __name__ == "__main__":
    n = int(input("Enter the number of increment threads: "))
    m = int(input("Enter the number of decrement threads: "))

    start_time = time.time()
    main(n, m)
    end_time = time.time()

    print(f"Execution time: {end_time - start_time} seconds")
