def uniquePhrases = 0
new File( getClass().getResource('/puzzle_input_day4.txt').toURI() ).eachLine { line ->
    def separatedLines = line.split(' ')
    def separatedLineSize = separatedLines.size()
    def uniqueLineItems = 0
    def listSortedItems = []

    separatedLines.each {
        listSortedItems << it.split("(?!^)").sort().join()
        uniqueLineItems = listSortedItems.unique().size()
    }

    if(uniqueLineItems == separatedLineSize) uniquePhrases++
}

println uniquePhrases
