package com.example.agendiario;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "ocurrences")



public class Ocurrence {


    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "ocurrencesId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "ocurrencesDescription")
    private String mDescription;

    private String mForwarding;;

    public Ocurrence(@Nullable String description,String mForwarding , int grade, String creationDate) {
        mDescription = description;
        mForwarding = Forwarding;
        mGrade = grade;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDiscription(String description) {
        mDescription = description;
    }

    public String getForwarding() {
        return mForwarding;
    }

    public void setForwarding(String
 Forwarding) {
        mForwarding = Forwarding;
    }

    public int getGrade() {
        return mGrade;
    }

    public void setGrade(int grade) {
        mGrade = grade;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mGrade;
    private String mCreationDate;

}
