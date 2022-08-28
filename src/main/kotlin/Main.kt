fun main() {
    val comission = 0.75 //Коммисия за переводы с любых карт
    val minComission = 3500 //Минимальная коммисия за переводы
    val amount = 100000 //Сума перевода
    val transerResult = if ((amount - (amount * comission)) < minComission) amount - minComission else (amount * comission).toInt() //Определение суммы перевода после вычета коммисии
    println(transerResult)
}