def input = []
new File( 'puzzle_input_day5.txt' ).eachLine { line ->
    input << line.toInteger()
}

def counter = 0
def currentLocation = 0
while (currentLocation < input.size()) {

    def tempLoc = currentLocation
    def tempVal = input[currentLocation]
    def incrementVal = (tempVal>=3) ? -1 : 1


    if(input[currentLocation] == 0){
        input[tempLoc] = tempVal + incrementVal
    } else {
        tempLoc = currentLocation
        tempVal = input[currentLocation]
        currentLocation = currentLocation + input[currentLocation]
        input[tempLoc] = tempVal + incrementVal
    }
    counter++
}

print counter