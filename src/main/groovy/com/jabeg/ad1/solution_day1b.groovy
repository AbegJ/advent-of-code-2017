def arrInput = new File(getClass().getResource('/puzzle_input_day1.txt').toURI()).text.toList()

int times = (arrInput.size() / 2).toInteger()

def firstHalf = arrInput.take(times)
def secondHalf = arrInput.drop(times)
def result = []

firstHalf.eachWithIndex { Object o, int i ->
    (o == secondHalf[i]) ? (result << o.toString().toInteger() * 2 ) : 0
}

println result.sum()