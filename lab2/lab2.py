class Equipment:
    def __init__(self, name, category, price):
        self.name = name
        self.category = category  # Например: "Шлем", "Перчатки", "Куртка"
        self.price = price

    def __str__(self):
        return f"Equipment: {self.name}, Category: {self.category}, Price: {self.price}"


class Motorcyclist:
    def __init__(self, name):
        self.name = name
        self.equipment = []

    def add_equipment(self, equipment):
        self.equipment.append(equipment)

    def total_equipment_cost(self):
        return sum(item.price for item in self.equipment)

    def sort_equipment_by_price(self):
        return self.equipment.sort(key=lambda item: item.price)

    def find_equipment_by_price_range(self, min_price, max_price):
        return [item for item in self.equipment if min_price <= item.price <= max_price]


def console_menu(motorcyclist):
    while True:
        print("\n1. Добавить элемент экипировки")
        print("2. Показать всю экипировку")
        print("3. Подсчитать общую стоимость экипировки")
        print("4. Отсортировать экипировку по цене")
        print("5. Найти экипировку по диапазону цен")
        print("0. Выйти")

        choice = input("Выберите действие: ")

        if choice == '1':
            name = input("Название экипировки: ")
            category = input("Категория (Шлем, Перчатки, Куртка и т.д.): ")
            price = float(input("Цена: "))
            equipment = Equipment(name, category, price)
            motorcyclist.add_equipment(equipment)

        elif choice == '2':
            for item in motorcyclist.equipment:
                print(item)

        elif choice == '3':
            print("Общая стоимость экипировки:", motorcyclist.total_equipment_cost())

        elif choice == '4':
            motorcyclist.sort_equipment_by_price()
            print("Экипировка отсортирована по цене.")
            for item in motorcyclist.equipment:
                print(item)

        elif choice == '5':
            min_price = float(input("Минимальная цена: "))
            max_price = float(input("Максимальная цена: "))
            equipment = motorcyclist.find_equipment_by_price_range(min_price, max_price)
            if equipment:
                print("Экипировка в заданном диапазоне цен:")
                for item in equipment:
                    print(item)
            else:
                print("Нет экипировки в заданном диапазоне цен.")

        elif choice == '0':
            break

        else:
            print("Неверный выбор")


if __name__ == "__main__":
    motorcyclist = Motorcyclist("John Doe")
    console_menu(motorcyclist)
