package com.czz.javaSeHomeWork;


/**
 * 数组模拟栈
 */
public class ArrayStack {
    Object[] obj;//存放栈元素数组
    int top;//栈帧
    public ArrayStack(){
        obj = new Object[10];
        top=-1;
    }
    public ArrayStack(int MaxLength){
        obj=new Object[MaxLength];
        top=-1;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        return false;
    }

    /**
     * 判断栈是否满
     * @return
     */
    public boolean isFull(){
        if (top==obj.length-1){
            return true;
        }
        return false;
    }

    /**
     * 弹栈
     * @return
     * @throws Exception
     */
    public Object pop() throws Exception {
        if (isEmpty()){
            throw  new Exception("栈空！");
        }

        return obj[top--];
    }

    /**
     * 压栈
     * @param object
     */
    public void push(Object object){
        if (isFull()){
            System.out.println("栈满");
            return;
        }
        obj[++top]=object;

    }

    /**
     * 打印元素
     */
    public void print(){
        if (isEmpty()){
            System.out.println("栈空！");
        }

        for (int i = top; i>=0; i--) {
            System.out.print(obj[i].toString()+"  ");
        }
        System.out.println("");
    }
    public Object getTop(){
        return obj[top];
    }
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        try {
        String s = "helloworld";
        String s1 = "helloworld1";
        String s2 = "helloworld2";
        arrayStack.push(s);
        arrayStack.push(s1);
        arrayStack.push(s2);
        arrayStack.print();
        arrayStack.pop();
            arrayStack.pop();

           arrayStack.print();
            System.out.println("栈顶元素:"+arrayStack.getTop().toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
