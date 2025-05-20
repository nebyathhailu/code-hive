def hello():
    print("Hello AkiraChix!")
# hello()

def say_hello(name):
    print(f"Hello {name}")
# say_hello("Nebyat")
# say_hello("Jane")
# say_hello("Austine")

def hello_student(name,age):
    year = 2025 - age
    print(f"Hello {name}, born in {year}")

def my_country(name="Uganda"):
    print(f"I love my country {name}")

def hello_students(*students):
    for student in students:
        print(f"Hello {student}")

def welcome_student(**kwargs):
    print(kwargs)
    name = kwargs.get("name","Student")
    age = kwargs.get("age","undefined")
    country = kwargs.get("country","Unknown country")
    print(f"Hello {name} from {country}, your age is {age}")

def stats(*arg, **kwargs):
    print(arg)
    print(kwargs)