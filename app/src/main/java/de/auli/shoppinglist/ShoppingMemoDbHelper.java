package de.auli.shoppinglist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ShoppingMemoDbHelper extends SQLiteOpenHelper {
    private static final String LOG_TAG = ShoppingMemoDbHelper.class.getSimpleName();

    public ShoppingMemoDbHelper(Context context) {
        super(context, "PLATZHALTER_DATENBANKNAME", null, 1);
        Log.d(LOG_TAG, String.format("DbHelper hat die Datenbank: %s erzeugt.", super.getDatabaseName()));
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}