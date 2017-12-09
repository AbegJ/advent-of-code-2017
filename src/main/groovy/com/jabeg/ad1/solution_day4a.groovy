def uniquePhrases = 0
new File( getClass().getResource('/puzzle_input_day4.txt').toURI() ).eachLine { line ->
    def ln =  line.tokenize()
    def fullList = ln.size()
    def uniqueList = ln.unique().size()
    if(fullList == uniqueList){
        uniquePhrases++
    }
}

println uniquePhrases
