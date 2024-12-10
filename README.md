# Lab 6: Working with Collections in Java
### Variant: **Student ID = 21**

### Calculations:
- **C2 = 21 % 2 = 1** → The collection implements the `Set` interface.
- **C3 = 21 % 3 = 0** → The internal structure of the collection is an array with:
  - Initial size of 15.
  - Capacity increased by 30% when the array is full.


## Key Features

1. **Custom Implementation of Set Interface:**
   - Fully functional `Set`-like behavior with dynamic resizing.
   - Designed for `Aircraft` objects (or other generic types).

2. **Dynamic Array-Based Storage:**
   - Starts with an initial capacity of 15 elements.
   - Automatically expands by 30% when the capacity is exceeded.

3. **Three Constructors:**
   - Empty constructor.
   - Constructor with a single element.
   - Constructor with a collection.

4. **Integration with Lab 5:**
   - The collection works seamlessly with `Aircraft` objects, including its subclasses (`PassengerPlane`, `CargoPlane`, `PrivateJet`).

## How to Run

1. Clone the repository.
2. Open the project in a Java IDE.
3. Run the `Main` class.

## Requirements

- JDK 8 or later.