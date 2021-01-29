import javax.print.attribute.standard.PrinterInfo
import kotlin.math.*

fun main()
{
    println("\nРешебник на языке программирования Kotlin по Задачнику Абрамяна.")
    println("Внутренний синтаксис (Begin8 = b8, Begin10 = b10, Integer1 = i1, Case1 = c1, Begin5 = b5, Begin6 = b6, Begin1_Begin2 = b1_b2, Begin3 = b3, Begin4 = b4)")
    println("Список доступных задач:")
    println("Begin1_Begin2, Begin3, Begin4, Begin5, Begin6 Begin8, Begin10, Integer1, Case1")
//    println("Список доступных задач:")
//    println("Список доступных задач:")
    print("Выберите задачу: "); var user_choise = readLine()
    when(user_choise)
    {
        "b1_b2" -> Begin1_Begin2()
        "b3"  -> Begin3()
        "b4" -> Begin4()
        "b5" -> Begin5()
        "b8" -> Begin8()
        "b10" -> Begin10()
        "c1"  -> Case1()
        "i1" -> Integer1()
        "b6" -> Begin6()
        else -> print("Такой задачи нет!")



    }
}



fun Begin1_Begin2()
{
    println("Введите сторону квадрата: ")
    var a = readLine()!!.toFloat()
    println("Введите операцию: найти площадь квадрата (S) или периметр квадрата (P)")
    var oper = readLine()
    println("Введите единицу измерения (мм, см, дм, м, км): ")
    var edizm = readLine()
    if (oper == "S")
    {
        var ss = (a*a)
        print(ss)
        print( edizm)
    }
    if (oper == "P")
    {
        var pp = (a*4)
        print(pp)
        print( edizm)
    }

}


fun Begin3()
{
    print("\nСделал Васильев Егор")
    print("\nДаны стороны прямоугольника a и b. Найти его площадь S = a·b и периметр P = 2·(a + b).")
    print("\nВведите а: ")
    var a = readLine()!!.toInt()
    print("\nВведите b: ")
    var b = readLine()!!.toInt()
    println("Введите единицу измерения (мм, см, дм, м, км): ")
    var edizm = readLine()
    var S = a * b
    var P = 2 * (a + b)
    print("\nS: $S $edizm")
    print("\nP: $P $edizm")
}
fun Begin4()
{
    print("\nСделал Васильев Егор")
    print("\nДан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14.")
    print("\nВведите d: ")
    var d = readLine()!!.toInt()
    println("Введите единицу измерения (мм, см, дм, м, км): ")
    var edizm = readLine()
    var π = 3.14
    var L = π * d
    print("\nL: $L $edizm")
}
fun Begin5()
{
    print("\n Сделал Васильев Егор")
    print("\n Дана длина ребра куба a. Найти объем куба V = a3 и площадь его поверхности S = 6·a2")
    print("\n Введите a: ")
    var a = readLine()!!.toInt()
    var V = (a * 3)
    var a2 = (a * 2)
    var S = (a2 * 6)
    print("Введите единицу измерения (мм, см, дм, м, км): ")
    var edizm = readLine()
    print("Объём (V) = $V $edizm")
    print("\nПлощадь (S) = $S $edizm")
}
fun Begin6()
{
    print("\n Сделал Васильев Егор")
    print("\n Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).")
    print("\n Введите a: ")
    var a = readLine()!!.toInt()
    print("\n Введите b: ")
    var b = readLine()!!.toInt()
    print("\n Введите c: ")
    var c = readLine()!!.toInt()
    print("Введите единицу измерения (мм, см, дм, м, км): ")
    var edizm = readLine()
    var V = (a * b * c)
    var S = 2 * (a * b + b * c + a * c)
    print("Объём: $V $edizm")
    print("\nПлощадь поверхности: $S $edizm")
}
fun Begin8()
{
    print("Сделал Васильев Егор")
    print("\nДаны два числа a и b. Найти их среднее арифметическое: (a + b)/2.\nВведите a: ")
    var a = readLine()!!.toFloat()
    print("Введите b: ")
    var b = readLine()!!.toFloat()
    var srar = (a + b) / 2
    print("Среднее арифметическое двух чисел = $srar ")
}
fun Begin9()
{


}
fun Begin10()
{
    print("Сделал Васильев Егор")
    print("\n Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов.\n Введите а: ")
    var a = readLine()!!.toFloat()
    print(" Введите b: ")
    var b = readLine()!!.toFloat()
    var pow2_plus = a.pow(2)+b.pow(2)
    var pow2_minus = a.pow(2)-b.pow(2)
    var pow2_multi = a.pow(2)*b.pow(2)
    var pow2_div = a.pow(2)/b.pow(2)
    println("Сумма = $pow2_plus")
    println("Разность = $pow2_minus")
    println("Произведение = $pow2_multi")
    println("Частное = $pow2_div")
}
fun Integer1()
{
    print("Сделал Васильев Егор")
    print("\n Дано расстояние L в сантиметрах. Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).")
    var L = readLine()!!.toInt()
    var M = (L / 100)
    print("\n Метров: $M")
}
fun Case1()
{
    print("Сделал Васильев Егор")
    print("\n Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).")
    var dw = readLine()
    if (dw == "1")
    {
        print("Понедельник")
    }
    if (dw == "2")
    {
        print("Вторник")
    }
    if (dw == "3")
    {
        print("Среда")
    }
    if (dw == "4")
    {
        print("Четверг")
    }
    if (dw == "5")
    {
        print("Пятница")
    }
    if (dw == "6")
    {
        print("Суббота")
    }
    if (dw == "7")
    {
        print("Воскресенье")
    }
}


