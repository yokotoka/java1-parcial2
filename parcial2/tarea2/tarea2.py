def main():
    distance = int(input("Enter distantion to destination: "))
    step = 100
    direction = "forward"
    actual = 0
    result = []

    while actual >= 0:
        actual += step
        if actual > distance: # change direction
            actual = distance - (actual - distance)
            step *= -1
            direction = "backward"
        if actual < 0:
            break
        stop_name = input("Enter name of stop: ")
        result.append((stop_name, actual, direction))

    if not result:
        print("Refueling is not required")
    else:
        for i in result:
            print(f"Refueled at {i[0]} {i[1]} km in the {i[2]} direction")


if __name__ == "__main__":
    main()