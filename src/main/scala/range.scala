object range extends App {

    // Define a range from 1 to 5 inclusive.
    var rango = 1 to 5;
    print(rango); // Print the range itself (not its elements).

    // Iterate through the elements of the 'rango' using a for loop.
    for(i <- rango){
        print(i) // Print each element of the range.
    }

    // Define a range from 0 to 20 with a step of 4.
    var rango2 = 0 to 20 by 4

    // Iterate through the elements of the 'rango2' using a for loop.
    for(i <- rango2){
        print(i) // Print each element of the range.
    }
}
