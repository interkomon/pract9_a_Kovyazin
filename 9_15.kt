import Exams.Exam as NewExam

fun main(){
    var OgeExamsOne = Oge("Гимназия №5",9.00,"ОГЭ","Шурков Д.А","Математика",2020,4)
    OgeExamsOne.OgeInfo()
    OgeExamsOne.DateOge()
    OgeExamsOne.Estimate()
    OgeExamsOne.Subjects()
    var OgeExamsMath = NewExam("ОГЭ","Дубров В.С","Математика",2021,5)
    var OgeExamsRuss = NewExam("ОГЭ","Шоротов Г.П","Русский",2020,4)
    var OgeExamsInfr = NewExam("ОГЭ","Тютчев В.Е","Информатика",2022,5)

    println("Название экзамена : ${OgeExamsMath.nameekz}  Имя студента: ${OgeExamsMath.name} Предмет: ${OgeExamsMath.subject} Год: ${OgeExamsMath.date} Оценка: ${OgeExamsMath.estimation}")
    println("Название экзамена : ${OgeExamsRuss.nameekz}  Имя студента: ${OgeExamsRuss.name} Предмет: ${OgeExamsRuss.subject} Год: ${OgeExamsRuss.date} Оценка: ${OgeExamsRuss.estimation}")
    println("Название экзамена : ${OgeExamsInfr.nameekz}  Имя студента: ${OgeExamsInfr.name} Предмет: ${OgeExamsInfr.subject} Год: ${OgeExamsInfr.date} Оценка: ${OgeExamsInfr.estimation}")




    var EgeExamsOne = Ege("Школа №19",8.30,"ЕГЭ","Григорьев М.Д","Физика",2021,5)
    EgeExamsOne.EgeInfo()
    EgeExamsOne.CreatorEge()
    EgeExamsOne.Estimate()
    EgeExamsOne.Subjects()
    var EgeExamsFizi = NewExam("ЕГЭ","Шомон Р.А","Физика",2023,5)
    var EgeExamsLite = NewExam("ЕГЭ","Аронов А.С","Литература",2022,4)
    var EgeExamsHist = NewExam("ЕГЭ","Кучеров А.А","История",2021,3)

    println("Название экзамена : ${EgeExamsFizi.nameekz}  Имя студента: ${EgeExamsFizi.name} Предмет: ${EgeExamsFizi.subject} Год: ${EgeExamsFizi.date} Оценка: ${EgeExamsFizi.estimation}")
    println("Название экзамена : ${EgeExamsLite.nameekz}  Имя студента: ${EgeExamsLite.name} Предмет: ${EgeExamsLite.subject} Год: ${EgeExamsLite.date} Оценка: ${EgeExamsLite.estimation}")
    println("Название экзамена : ${ EgeExamsHist.nameekz}  Имя студента: ${ EgeExamsHist.name} Предмет: ${ EgeExamsHist.subject} Год: ${ EgeExamsHist.date} Оценка: ${EgeExamsHist.estimation}")



}