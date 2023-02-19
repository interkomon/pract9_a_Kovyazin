import Exams.*

class Ege(var place: String, var time : Double,nameekz: String, name:String,subject: String,date:Int,estimation:Int): Exam(nameekz,name,subject,date,estimation) {

    public fun EgeInfo(){


        println("$nameekz  — централизованно проводимый в Российской Федерации экзамен в средних учебных заведениях — школах, лицеях и гимназиях, форма проведения ГИА по образовательным программам среднего общего образования[1]. Служит одновременно выпускным экзаменом из школы и вступительным экзаменом в вузы. ")


    }


    public fun CreatorEge(){

        println("Владимир Хлебников  придумал $nameekz ")

    }
    override fun GetInfo() {
        println("Экзамен: $nameekz")
        println("Имя студента: $name")
        println("Предмет: $subject")
        println("Год: $date")
        println("Оценка $estimation")

    }








}