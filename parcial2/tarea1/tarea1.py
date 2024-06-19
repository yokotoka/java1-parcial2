import random

NUM_STUDENTS = 10

def main():
    names = []
    grades = []
    passed = 0
    promoted = 0
    failed = 0
    max_grade = 0
    max_names = []
    sum_grades = 0

    for i in range(NUM_STUDENTS):
        name = input(f"Enter the name of student {i + 1}: ")
        grade = random.randint(1, 10)

        names.append(name)
        grades.append(grade)

        sum_grades += grade
        if grade >= 4:
            passed += 1
        elif grade >= 7:
            promoted += 1
        elif grade < 4:
            failed += 1

        if grade > max_grade:
            max_grade = grade
            max_names = [name]
        elif grade == max_grade:
            max_names.append(name)

    print(f"Number of passing grades: {passed}")
    print(f"Number of promoted grades: {promoted}")
    print(f"Number of failing grades: {failed}")
    print(f"Highest grade: {max_grade}, Name(s) of the student(s) with the highest grade: {', '.join(max_names)}")
    print(f"Average grade: {sum_grades / NUM_STUDENTS:.2f}")

if __name__ == "__main__":
    main()
