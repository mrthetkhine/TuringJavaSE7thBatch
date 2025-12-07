package main

import "fmt"

func div(numerator, denominator int) (int, error) {
	if denominator == 0 {
		return 0, fmt.Errorf("cannot divide by zero")
	}
	return numerator / denominator, nil
}
func main() {
	fmt.Println("Hello, World!")
	result, err := div(10, 0)
	if err != nil {
		fmt.Println("Error ", err)
	} else {
		fmt.Println("Success ", result)
	}
}
