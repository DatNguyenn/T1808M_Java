package Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    public Integer ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public Float AverageRate;

    public ArrayList<Array> RateList;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println(Title+ PublishDate+ Author+ Content+ AverageRate);
    }

    public void Calculate(){
        float Tong=0;
        for (Array A:this.RateList){
            for (int i=0;i<3;i++){
                Tong+=A.array[i];
            }
        }
        AverageRate=Tong/3;
        System.out.println("Trung Binh Cong :"+ AverageRate);
    }
}
