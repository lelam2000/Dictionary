package com.example.dic_v1;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
public class DatabaseOpenHelper2 extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "viet_anh.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper2(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

}
