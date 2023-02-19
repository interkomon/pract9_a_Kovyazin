package Exams

import javax.security.auth.Subject


open  class Exam(var name_:String)
 {
    var nameekz = "ОГЭ"
    var name = name_
    var subject = "Информатика"
    var date = 2023
    var estimation = 5



     constructor(nameekz_: String,name_: String,subject_: String,date_: Int,estimatiom_: Int) : this(name_){
         nameekz = nameekz_
         name = name_
         subject = subject_
         date = date_
         estimation = estimatiom_


     }

     open fun Estimate(){
         try {
             println("Введите оценку, чтобы узнать информацию")
             estimation = readLine()!!.toInt()

             when (estimation) {
                 5 -> println(" Число людей кто решил ЕГЭ по математике на 5 - составило 579 человек  ")
                 4 -> println(" Число людей кто решил ЕГЭ по математике на 4 - составило 11500 человек  ")
                 3 -> println(" Число людей кто решил ЕГЭ по математике на 3 - составило 31000 человек  ")
                 2 -> println(" Число людей кто решил ЕГЭ по математике на 2 - составило 8% человек  ")
                 else -> println("Ошибка, проверь, все ли правильно")

             }
         } catch (e:Exception)
         {
             println("Ошибка. Попробуй еще убедись, что в твоем вводе нету ошибок")
         }



     }
     open fun Subjects(){
         try {


             println("Введите предмет, чтобы узнать количетсво сдавших ЕГЭ по предметам по выбору")
             subject = readLine()!!.toString()

             when (subject) {
                 "Обществознание" -> println("410000 человек")
                 "Физика" -> println("200000 человек")
                 "История" -> println("160000 человек")
                 "Биология" -> println("150000 человек")
                 "Химия" -> println("70000 человек")
                 "Иностранные языки" -> println("70000 человек")
                 "Информатика" -> println("70000 человек")
                 "Литература" -> println("50000 человек")
                 "География" -> println("30000 человек")
                 else -> println("Убедитесь, что с Большой буквы и написан прдемет по выбору! ")


             }
         }catch (e: Exception)
         {
             println("Ошибка. Попробуй еще убедись, что в твоем вводе нету ошибок")
         }


     }
     open fun GetInfo(){
         println("Информация об экзамене/n Экзамен - $nameekz Имя студента: $name Предмет: $subject Год: $date Оценка: $estimation")

     }



}