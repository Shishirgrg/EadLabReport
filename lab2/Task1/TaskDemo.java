class TaskDemo
{
    public static void main(String args[])
    {
        Task task = new Task();
        task.setName("Shishir Gurung");
        task.isCompletedTask();
        System.out.println("Name set = " + task.name);
        System.out.println("Task completed = " + task.isCompleted);
    }
}