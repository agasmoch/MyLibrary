package com.agasmochfauzan.mylibary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "student_database";
    public static final int DATABASE_VERSION=1;
    public static final String TABLE_STUDENT = "students";
    public static final String KET_ID="id";
    public static final String KEY_FIRSTNAME= "name";

    private static final String CREATE_TABLE_STUDENT="";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
