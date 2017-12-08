def input = 361527

def multiplier = 7 // 7 multiplier for the pattern
def center = 1 // Center value of grid
def fromCenter = 0 // Number of spaces down from the center
def currentCount = 0// Current value in the spiral going directly down from 1
def tempCount = 0 // Temporary count used to make the loop doesn't go past the input value

// Find the number of steps it takes to get down to
// value that is closest to the input
while (tempCount <= input) {

    if (fromCenter == 0 && currentCount < input) {
        currentCount = center + multCounter
    } else {
        tempCount = currentCount + (multiplier * (fromCenter + 1)) + fromCenter
        currentCount = (tempCount <= input) ? tempCount : currentCount
    }
    fromCenter++
}

// find the number of steps from the closet number to get to the input value
def stepsFromCloset = input - currentCount

// Print the shortest distance accounting for the center value of 1
print stepsFromCloset - (fromCenter - 1)
