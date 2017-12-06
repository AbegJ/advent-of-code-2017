def file = new File(getClass().getResource('/puzzle_input_day1.txt').toURI()).text

def matches = file =~ /([0-9])\1+/
def rSum = 0

matches.each {x->
    def a = x[0].toString().length().toBigInteger()
    def b = x[1].toString().toBigInteger()
    a = a - 1
    rSum = (a * b) + rSum
}

if(file.substring(0,1) == file.reverse().substring(0,1)){
    rSum = rSum + file.substring(0,1).toInteger()
}

println rSum