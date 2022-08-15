class Data:
    def __init__(self):
        self.nums = [1, 2, 3, 4]

    def numbers(self):
        return self.nums


class Unit(Data):

    def __init__(self):
        super().__init__()
        self.label = "Person"

    def main(self):
        print(self.numbers(), self.label)


if __name__ == '__main__':
    obj = Unit()
    obj.main()