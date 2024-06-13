// package multithreading;

//multitasking
//it allows several activities to occur concurrently on the computer 
//it is the ability of a CPU to perform multiple tasks or processes simultaneously
//it is the ability of an operating system to perform different tasks at the same time

//types of multitasking 

// 1.process based multitaksing
// 2.thread based multitasking

// thread vs process
// 1. thread is lightweight
// 2. thread is independent
// 3. thread shares the same memory space,which makes switching of features faster .
// 4. thread is used for small tasks
// 5. thread is faster
// 6. thread is easy to create


// 1. process is heavyweight
// 2. process is dependent
// 3. process has its own memory space
// 4. process is used for large tasks
// 5. process is slower
// 6. process is difficult to create



public class thread1 extends Thread{

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("inside thread1"+i);
        }
    }
}
