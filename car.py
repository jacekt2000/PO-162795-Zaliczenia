from vehicle import Vehicle


class Car(Vehicle):
    __price: float
    __colour: str
    __extra_seats: int

    def __init__(self, price: int = 0, colour: str = None,
                 extra_seats: int = 0,
                 reg: str = None, model: int = 0, prod_year: int = 2022):
        super().__init__(reg, model, prod_year)
        if price < 0:
            price = 0
            self.__price = price
        else:
            self.__price = price
        self.__colour = colour
        if extra_seats < 0:
            extra_seats = 0
            self.__extra_seats = extra_seats
        else:
            self.__extra_seats = extra_seats

    @property
    def price(self) -> float:
        return self.__price

    @property
    def colour(self) -> str:
        return self.__colour

    @property
    def extra_seats(self) -> int:
        return self.__extra_seats

    @price.setter
    def price(self, value: float) -> None:
        if 0 > value:
            value = 0
            self.__price = value
        else:
            self.__price = value

    @colour.setter
    def colour(self, value: None) -> None:
        self.__colour = value

    @extra_seats.setter
    def extra_seats(self, value: int) -> None:
        if 0 > value:
            value = 0
            self.__extra_seats = value
        else:
            self.__extra_seats = value

    def drive(self):
        return f'Jadę świetnym pojazdem z roku {self.prod_year}!\n '\
                f'Ma kolor{self.__colour}.'

    def __eq__(self, other):
        return self.model == other.model and self.__price == other.price

    def __ne__(self, other):
        return self.model != other.model and self.__price == other.price

    def __str__(self):
        if self.__colour is None and self.reg is None:
            return f'Pojazd wyprodukowany w roku {self.prod_year}.\n' \
                   f'Model : {self.model}.\n' \
                   f'Cena  {self.__price}.\n' \
                   f'Dodatkowe siedzenia{self.__extra_seats}.'
        elif self.reg is None:
            return f'Pojazd wyprodukowany w roku {self.prod_year}.\n' \
                f'Model:  {self.model}.\n' \
                f'cena:  {self.__price}.\n' \
                f'kolor: {self.__colour}.\n ' \
                f'dodatkowe siedzenia:  {self.__extra_seats}.'
        if self.__colour is None:
            return f'Pojazd wyprodukowany w roku {self.prod_year}.\n' \
                   f'Model {self.model}.\n' \
                   f'Rejestracja {self.reg}.\n' \
                   f'cena {self.__price}.\n' \
                   f'Dodatkowe siedzenia: {self.__extra_seats}.'
        else:
            return f'Pojazd wyprodukowany w roku {self.prod_year}.\n' \
                   f'Model {self.model}.\n' \
                   f'Rejestracja {self.reg}.\n' \
                   f'cena {self.__price}.\n' \
                   f'kolor: {self.__colour}.\n ' \
                   f'Dodatkowe siedzenia: {self.__extra_seats}.'
