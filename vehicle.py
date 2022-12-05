class Vehicle:
    __reg: str
    __model: int
    __prod_year: int

    def __init__(self, reg: str = None, model: int = 0,
                 prod_year: int = 2022) -> None:
        if model < 0 or prod_year < 1900 or prod_year > 2022:
            model = 0
            prod_year = 2022
            self.__model = model
            self.__prod_year = prod_year
        else:
            self.__model = model
            self.__prod_year = prod_year
        self.__reg = reg

    @property
    def reg(self):
        return self.__reg

    @property
    def model(self) -> int:
        return self.__model

    @property
    def prod_year(self) -> int:
        return self.__prod_year

    @reg.setter
    def reg(self, value: str) -> None:
        self.__reg = value

    @model.setter
    def model(self, value: int) -> None:
        if 0 > value:
            value = 0
            self.__model = value
        else:
            self.__model = value

    @prod_year.setter
    def prod_year(self, value: int) -> None:
        if 1900 > value or 2022 < value:
            value = 2022
            self.__prod_year = value
        else:
            self.__prod_year = value

    def brake(self):
        return "Zatrzymuję się"

    def drive(self):
        return f'Jadę świetnym pojazdem z roku {self.__prod_year}!'

    def __str__(self):
        if self.__reg is None:
            return f'Pojazd wyprodukowany w roku: {self.__prod_year}.\n' \
                f'Model: {self.__model}.'
        else:
            return f'Pojazd wyprodukowany w roku: {self.__prod_year}.\n' \
                f'Model: {self.__model}.\n' \
                f'Rejestracja: {self.__reg}.'

    def __eq__(self, other):
        if self.__model == self.__model:
            return
        return self.__prod_year == other.__prod.year

    def __ne__(self, other):
        return self.__prod_year != other.__prod.year
