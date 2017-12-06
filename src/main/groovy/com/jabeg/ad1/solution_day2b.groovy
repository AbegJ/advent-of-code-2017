def rSum = 0
new File( getClass().getResource('/puzzle_input_day2.txt').toURI() ).eachLine { line ->
    def ln =  line.tokenize()
    def cols = ln*.asType(Integer)
    def combo = [cols,cols].combinations().findAll{
        a,b ->
            a!=b && (a%b)==0
    }
    combo.each {x->
        def y = x[0]
        def z = x[1]
        rSum = rSum + (y/z)
    }
}

print rSum