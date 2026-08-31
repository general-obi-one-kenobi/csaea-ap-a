def check_animal(name):
    animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]
    for i in animals:
        if i == name:
            x=True
        else: x=False
    if x == True:
        print(f"{name} is in the list")
    else:
        print(f"{name} is not in the list")
check_animal("cat")
check_animal("penguin")