import Exams.*
import javax.security.auth.Subject

class Oge(var place: String, var time : Double,nameekz: String, name:String,subject: String,date:Int,estimation:Int): Exam(nameekz,name,subject,date,estimation) {

    public fun OgeInfo(){


        println("$nameekz итоговый экзамен за курс основного общего образования в России. Служит для контроля знаний, полученных учащимися за 9 лет, а также для приёма в учреждения среднего профессионального образования")


    }
    public fun DateOge(){

        println("$nameekz - в 2009 году этот экзамен стал обязательным для всех выпускников одиннадцатого класса ")

    }

    override fun GetInfo() {
        println("Экзамен: $nameekz")
        println("Имя студента: $name")
        println("Предмет: $subject")
        println("Год: $date")
        println("Оценка $estimation")

    }


}