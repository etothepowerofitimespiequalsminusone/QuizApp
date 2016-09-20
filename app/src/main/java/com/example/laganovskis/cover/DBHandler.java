package com.example.laganovskis.cover;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Laganovskis on 9/2/2016.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "albumcovers.db";
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_ALBUMNAME = "albumname";
    public static final String COLUMN_ALBUMURL = "albumurl";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query  = "create table " + TABLE_ALBUMS + "(" + COLUMN_ID + " INT PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_ALBUMNAME + " TEXT " +
                COLUMN_ALBUMURL + "TEXT" +
                ");";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

       sqLiteDatabase.execSQL("drop table if exists");
       onCreate(sqLiteDatabase);
    }

    public void add(Albums albumname)
    {
        ContentValues album = new ContentValues();
        album.put(COLUMN_ALBUMNAME, albumname.getAlbumName());
        album.put(COLUMN_ALBUMURL, albumname.getAlbumURL());
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.insert(TABLE_ALBUMS,null, album);
        sqLiteDatabase.close();
    }

    public void delete()
    {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("Delete * from " + TABLE_ALBUMS);
    }

}
