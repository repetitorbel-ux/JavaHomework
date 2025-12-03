package org.example.task20;

import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable<String> {
    private String prefix = "file_";
    private String postfix = ".txt";
    private int index;
    private String str = "String ";


    public FileGenerator(int indexPar) {
        this.index = indexPar;
//        System.out.println("index = " + this.index);
    }

    private String generateFileName(){
        String nameOfFile = prefix + index + postfix;
//        System.out.println("Имя файла " + nameOfFile);
        return nameOfFile;
    }

    private String generateString(){
        String strIn = str + index;
//        System.out.println("Строка в файле " + strIn);
        return strIn;
    }

    private String createFile(String path, String name){

        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file)){
            for (int i = 0; i < 10; i++){
                fileWriter.write(str + i + "\n");
            }
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
        System.out.println(file.getName());
        return file.getName();
    }

    @Override
    public String call() throws Exception {
        System.out.println(("start " + Thread.currentThread().getName()));
        String fileName = generateFileName();
        String strInFile = generateString();
        String path = "files\\" + fileName;
        createFile(path, strInFile);
        Thread.sleep(2000);

        return fileName;
    }
    /*1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды, результат выполнения – коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
     */
    public String getPrefix() {
        return prefix;
    }

    public String getPostfix() {
        return postfix;
    }

    public int getIndex() {
        return index;
    }

    public String getStr() {
        return str;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setStr(String str) {
        this.str = str;
    }

}

/*1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды, результат выполнения –коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */