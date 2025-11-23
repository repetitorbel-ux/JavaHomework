package org.example.task17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainReaderWriter {
    public static void main(String[] args) {
        String str = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him";

        //Используем в качестве пути папку+файл
        String absolutePath = "L:\\Java_Core\\files\\absolutePath.txt";
        String relativePath = "relativePath.txt";

        //Запись файлов
        write1(str, absolutePath);
        write2(str, relativePath);

        //Чтение файлов
        read1(absolutePath);
        read2(relativePath);
    }

    private static void write1(String str, String path) {

        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(str);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

    private static void write2(String str, String path) {

        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(str);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

    private static void read1(String path) {
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

    private static void read2(String path) {
        System.out.println();
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

}
/*
Дан текст:
1.1 Записать его в файл, прописав относительный путь. Реализуйте соответствующий метод в классе Main.
1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
1.4 Вычитать текст из второго файла. Реализуйте соответствующий метод в классе Main
 */