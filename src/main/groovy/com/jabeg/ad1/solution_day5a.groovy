def input = []
new File( 'puzzle_input_day5.txt' ).eachLine { line ->
    input << line.toInteger()
}

def counter = 0
def currentLocation = 0
while (currentLocation < input.size()) {

    def tempLoc = currentLocation
    def tempVal = input[currentLocation]

    if(input[currentLocation] == 0){
        input[tempLoc] = tempVal + 1
    } else {
        tempLoc = currentLocation
        tempVal = input[currentLocation]
        currentLocation = currentLocation + input[currentLocation]
        input[tempLoc] = tempVal + 1
    }
    counter++
}

print counter