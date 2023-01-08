fun main(){
    var task1= Task(1,"haya", "travelling", completed = false )
    var task2 =Task(2,"khaled","working", completed = false)

    var todolist=ToDo()
    todolist.addtask(task1)
    todolist.addtask(task2)
    todolist.show()
    todolist.changeTask(Task)
    todolist.removeTask(Task)
    todolist.specificTask(ID = 2)



}
data class Task(
val ID:Int,
var name:String,
var note:String,
var completed:Boolean =false
)

class ToDo {
    var tasks = arrayListOf<Task>()
    fun addtask (task: Task){
        tasks.add(task)

    }


    fun show(){
        for (i in tasks) {
            println(i)
             }
        }

    fun specificTask(ID: Int){

        for (i in 0 until tasks.size)
            if (ID == tasks[i].ID){
                println("Task is ${tasks[i]}")
                break
            }
    }
    fun addTask(task: Task) {
    }
    fun removeTask(task: Task){
        for()
    }
    fun changeTask (completed: Task){
        for(i in tasks)
            if(i == false)
    }
}











