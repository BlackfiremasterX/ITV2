import kotlin.math.*

fun main()
{
    println("Решебник на языке программирования Kotlin по Задачнику Абрамяна.")
    println("Внутренний синтаксис(Begin1 - b1)")
    println("Список доступных задач:")
    println("Begin1")
//    println("Список доступных задач:")
//    println("Список доступных задач:")
    print("Выберите задачу: "); var user_choise = readLine()
    when(user_choise)
    {
        "b1" -> Begin1()
        "b10" -> Begin10()
        "c1"  -> Case1()
        else -> print("Такой задачи нет!")



    }
}



fun Begin1()
{
//АААААААААААААААААААААААААААААААААААААА
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

    ////

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

//Привет, ребята!
//Написал вот что-то, розовая собака228
//приф я чел какойта
//Hello, world!
//анимеее????
//дддддд
//ААААААААААААААААААААААААААААААААААААААААААААААААААААААААААААА


//IntelliJ IDEA
//Kotlin

//ITV-2
//GitHub
//454564554544
//я гульь

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







//хто я










//путиииинннне











//смертьььььь с касою



//qwert12345678







//радужные котыыыыы хых
