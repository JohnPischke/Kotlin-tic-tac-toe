class Board {


    var a1: Char = '-'
    var a2: Char = '-'
    var a3: Char = '-'
    var b1: Char = '-'
    var b2: Char = '-'
    var b3: Char = '-'
    var c1: Char = '-'
    var c2: Char = '-'
    var c3: Char = '-'


    fun display() {
        println(" |a|b|c")
        println("1|$a1|$b1|$c1")
        println("2|$a2|$b2|$c2")
        println("3|$a3|$b3|$c3")
    }

    fun changeboard(name:String, value:Char) {
        if ((name == "a1") and (a1 == '-')) a1 = value
        if ((name == "a2") and (a2 == '-')) a2 = value
        if ((name == "a3") and (a3 == '-')) a3 = value
        if ((name == "b1") and (b1 == '-')) b1 = value
        if ((name == "b2") and (b2 == '-')) b2 = value
        if ((name == "b3") and (b3 == '-')) b3 = value
        if ((name == "c1") and (c1 == '-')) c1 = value
        if ((name == "c2") and (c2 == '-')) c2 = value
        if ((name == "c3") and (c3 == '-')) c3 = value

    }
    fun reset() {
        a1 = '-'
        a2 = '-'
        a3 = '-'
        b1 = '-'
        b2 = '-'
        b3 = '-'
        c1 = '-'
        c2 = '-'
        c3 = '-'
    }

    fun check(player:Char):Boolean {
        var win = false
        if ((a1 == player) and (a2 == player) and (a3 == player)) {win = true}
        if ((b1 == player) and (b2 == player) and (b3 == player)) {win = true}
        if ((c1 == player) and (c2 == player) and (c3 == player)) {win = true}
        if ((a1 == player) and (b1 == player) and (c1 == player)) {win = true}
        if ((a2 == player) and (b2 == player) and (c2 == player)) {win = true}
        if ((a3 == player) and (b3 == player) and (c3 == player)) {win = true}
        if ((a1 == player) and (b2 == player) and (c3 == player)) {win = true}
        if ((a3 == player) and (b2 == player) and (c1 == player)) {win = true}
        return win
    }

}

fun main(args: Array<String>) {
    println("This is a game of two player Tic-Tac-Toe")
    println("Type the space you want to pick ie: a1, b3, c2")
    var playgame = true
    while (playgame == true) {
        play()
        println("Would you like to play again?")
        var answer = readln()
        if ((answer == "no") or (answer == "No")) playgame = false


    }
 println("Thank you for playing my game!")
}

fun play(){
    var turn = 0
    var currentplayer = 'x'
    val board = Board()
    while(true) {

        board.display()
        println("current turn: $turn")
        println("Player $currentplayer choose your spot.")
        var input = readln()
        board.changeboard(input, currentplayer)
        if (board.check(currentplayer)) {
            println("Player $currentplayer has won!")
            break
        }
        if (currentplayer == 'x') currentplayer = 'o'
        else currentplayer = 'x'

        turn = (turn + 1)
        if (turn == 9) {
            println("Draw!")
            break
        }

    }
}