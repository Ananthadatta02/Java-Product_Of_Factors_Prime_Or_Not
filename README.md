
# Product of Factors - Prime Check

## Description

This Java program calculates the **product of all the factors** of a given number and checks whether the resulting product is a **prime number** or not. It involves factorization, multiplication, and a prime number check logic implemented using a separate method.

---

## How It Works

### 1. **Input the Number**
The program begins by prompting the user to enter an integer. This number is stored in the variable `num`, and a temporary copy is made in `temp`.

### 2. **Find All Factors and Calculate Their Product**
A `for` loop runs from 1 to `temp` and checks if a number divides `temp` evenly (i.e., no remainder). If so, that number is a factor and is multiplied into the variable `prod`.

```java
for(int i=1; i<=temp; i++) {
    if(temp % i == 0)
        prod *= i;
}
```

### 3. **Prime Check Logic**
The product of the factors is passed to a static method `isPrime(int num)` which checks for primality.

```java
public static boolean isPrime(int num) {
    int count = 0;
    for(int i=1; i<=num; i++) {
        if(num % i == 0)
            count++;
    }
    return count == 2;
}
```
A number is **prime** if it has exactly two distinct positive divisors: 1 and itself. This method returns `true` if the count of factors is exactly 2.

### 4. **Display the Result**
Based on the result of the `isPrime()` method, a message is printed stating whether the product is a prime number or not.

---

## Example

**Input:**
```
Enter the Number
6
```

**Factors of 6:** 1, 2, 3, 6  
**Product:** 1 × 2 × 3 × 6 = 36  
**36 is not a prime number.**

**Output:**
```
Product Of Factors is 36. It is Not a Prime
```

---

## Files

- `ProdOfFactors_Prime.java` : Main Java class containing the logic.

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Product_Of_Factors_Prime_Or_Not.git
```
