def vals = []
new File( getClass().getResource('/puzzle_input_day2.txt').toURI() ).eachLine { line ->
    def ln =  line.tokenize()
    def cols = ln*.asType(Integer)
    vals << (cols.max() - cols.min())
}

println vals.sum()