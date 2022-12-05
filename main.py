from vehicle import Vehicle
from car import Car


def main():
    v_1 = Vehicle(None, 0, 2022)
    print(v_1)
    v_2 = Vehicle(10, 5, 2020)
    print(v_2)

    c_1 = Car(0, None, 0)
    print(c_1)

if __name__ == "__main__":
    main()
