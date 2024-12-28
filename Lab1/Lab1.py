class Subscriber:
    def __init__(self, id, surname, name, middle_name, address, card_number, debit, credit, city_call_time, international_call_time):
        self.id = id
        self.surname = surname
        self.name = name
        self.middle_name = middle_name
        self.address = address
        self.card_number = card_number
        self.debit = debit
        self.credit = credit
        self.city_call_time = city_call_time
        self.international_call_time = international_call_time

    def __str__(self):
        return (f"{self.surname} {self.name} {self.middle_name}, Address: {self.address}, Card: {self.card_number}, "
                f"Debit: {self.debit}, Credit: {self.credit}, City Call Time: {self.city_call_time}, "
                f"International Call Time: {self.international_call_time}")


def print_subscribers_with_city_calls_exceeding(subscribers, threshold):
    filtered_subscribers = [subscriber for subscriber in subscribers if subscriber.city_call_time > threshold]
    for subscriber in filtered_subscribers:
        print(subscriber)


def print_subscribers_with_international_calls(subscribers):
    filtered_subscribers = [subscriber for subscriber in subscribers if subscriber.international_call_time > 0]
    if filtered_subscribers:
        print("Абоненты, пользовавшиеся международной связью:")
        for subscriber in filtered_subscribers:
            print(subscriber)
    else:
        print("Нет абонентов, пользовавшихся международной связью.")


def print_subscribers_sorted_by_name(subscribers):
    sorted_subscribers = sorted(subscribers, key=lambda subscriber: (subscriber.surname, subscriber.name))
    print("Абоненты в алфавитном порядке:")
    for subscriber in sorted_subscribers:
        print(subscriber)


if __name__ == "__main__":
    subscribers = [
        Subscriber(1, "Иванов", "Иван", "Иванович", "ул. Ленина, д.1", 1234567890123456, 1000, 500, 120, 30),
        Subscriber(2, "Петров", "Петр", "Петрович", "ул. Гагарина, д.5", 2345678901234567, 1500, 300, 60, 0),
        Subscriber(3, "Сидоров", "Сидор", "Сидорович", "ул. Советская, д.10", 3456789012345678, 2000, 700, 180, 20),
    ]
    city_call_threshold = 100  # Задаем пороговое значение
    print_subscribers_with_city_calls_exceeding(subscribers, city_call_threshold)

    print_subscribers_with_international_calls(subscribers)
    print()
    print_subscribers_sorted_by_name(subscribers)
