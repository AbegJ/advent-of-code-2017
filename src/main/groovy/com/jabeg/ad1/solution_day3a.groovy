def input = 361527

def multCounter = 7 // Counter that keeps incrementing by 7's
def mult = 7 // 7 multiplier
def start = 1 // Center
def index = 0
def currR = 0// Current value in the spiral going directly down from 1
def temp = 0

// Find the number of steps it takes to get down to
// value that is closest to the input
while (temp <= input) {

    if (index == 0 && currR < input) {
        currR = start + multCounter
    } else {
        temp = currR + multCounter + index
        currR = (temp <= input) ? temp : currR
    }

    index++
    multCounter = multCounter + mult
}

// find the number of steps from the closet number to get to the input
def stepsFromCloset = input - currR

print stepsFromCloset - (index - 1)
