package com.project.Devlot.tripcast.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.project.Devlot.tripcast.Model.User;

/**
 * Created by hassan on 3/2/18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "trip_cast";
    public static final int DATABASE_VERSION = 1;

    public static final String user_table_name = "user_table";

    public static final String user_id = "user_id";
    public static final String user_uid = "user_uid";
    public static final String user_name = "user_name";
    public static final String user_email = "user_email";
    public static final String user_imagePath = "user_imagePath";

    public static final String create_user_table = "CREATE TABLE "
            + user_table_name + "("
            + user_uid + " INTEGER PRIMARY KEY AUTO INCREMENT, "
            + user_name + " TEXT, "
            + user_email + " TEXT, "
            + user_imagePath + " TEXT);";


    public DatabaseHelper(Context context)
    {
      super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_user_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void create_user(User user) {
        ContentValues values = new ContentValues();

        values.put(user_uid, user.getUid());
        values.put(user_name, user.getName());
        values.put(user_email, user.getEmail());
        values.put(user_imagePath, user.getImagePath());

        getWritableDatabase().insert(user_table_name, null, values);
    }

    public User retrive_user() {
        Cursor cursor = getReadableDatabase().query(user_table_name,
                new String[] {user_uid, user_name, user_email, user_imagePath},
                null, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        return new User(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3));
    }

    public boolean delete_user() {
        if (getWritableDatabase().delete(user_table_name, user_id + "= 1", null) > 0)
            return true;
        else
            return false;
    }
}
