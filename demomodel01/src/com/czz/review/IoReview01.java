package com.czz.review;

import java.io.*;

//复习io相关知识
public class IoReview01 {
    public static void main(String[] args) {
        test09(new File("D:\\czzpydemo"),new File("D:\\czz1"));
    }

    /**
     * FileInputStream
     */
    public static void test01() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("demomodel01\\src\\com\\fiel\\file01");
            byte[] bytes = new byte[1024];
            int readData = 0;
            while ((readData = fileInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readData));
//                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * FileOutputStream
     */
    public static void test02() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("demomodel01\\src\\com\\fiel\\write01");

            String s = "heloworld";
            byte[] bytes1 = s.getBytes();
            fileOutputStream.write(bytes1);
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * FileInputStream And FileOutputStream Copy
     */
    public static void test03() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("demomodel01\\src\\com\\czz\\io\\Student.java");
            fileOutputStream = new FileOutputStream("demomodel01\\src\\com\\fiel\\copy01.txt");
            byte[] bytes = new byte[256];
            int readData = 0;
            while ((readData = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, readData);
            }
            System.out.println("复制成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * FileReader
     */
    public static void test04() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("demomodel01\\src\\com\\fiel\\copy01.txt");
            char[] chars = new char[256];
            int readDate = 0;
            while ((readDate = fileReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readDate));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /**
     * FileWriter
     */
    public static void test05() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("demomodel01\\src\\com\\fiel\\write02");
            fileWriter.write("HelloWorld!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * FileReader and FileWriter Copy
     */
    public static void test06() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("demomodel01\\src\\com\\czz\\io\\Student.java");
            fileWriter = new FileWriter("demomodel01\\src\\com\\fiel\\copy02.txt");
            char[] chars = new char[256];
            int readData = 0;
            while ((readData = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, readData);
            }
            System.out.println("复制成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * BufferdReader and BufferdWriter
     */
    public static void test07() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("demomodel01\\src\\com\\czz\\io\\Student.java")));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demomodel01\\src\\com\\fiel\\copy03.txt", true)));
//          char[] chars =new char[256];
////          int readData =0;
            String res = "";
            while ((res = bufferedReader.readLine()) != null) {
                bufferedWriter.write(res + "\n");
                bufferedWriter.flush();
            }
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*
     * PrintWriter
     */
    public static void test08() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("demomodel01\\src\\com\\fiel\\pw01.txt");
            pw.print("Helloworld!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    /**
     * CopyAll
     */
    public static void test09(File file, File fileCopy) {

            if (!file.isDirectory()) {
               String source=fileCopy.getAbsolutePath()+"\\"+file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf("\\"),file.getAbsolutePath().length());
                FileInputStream fileInputStream = null;
                FileOutputStream fileOutputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    fileOutputStream = new FileOutputStream(source);
                    byte[] bytes = new byte[1024*10];
                    int readData = 0;
                    while ((readData = fileInputStream.read(bytes)) != -1) {
                        fileOutputStream.write(bytes, 0, readData);
                    }
                    System.out.println("fu");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }else{

            fileCopy=new File(fileCopy.getAbsolutePath()+file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf("\\"),file.getAbsolutePath().length()));
            if (!fileCopy.exists()){
                fileCopy.mkdirs();
            }
        File[] files = file.listFiles();
        for (File f : files) {
            test09(new File(f.getAbsolutePath()),fileCopy);
         }
     }
    }
}



