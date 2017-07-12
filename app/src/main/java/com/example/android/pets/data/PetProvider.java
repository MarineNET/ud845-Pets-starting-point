package com.example.android.pets.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.android.pets.CatalogActivity;
import com.example.android.pets.EditorActivity;

/**
 * Created by Viktor Khon on 7/11/2017.
 */

public class PetProvider extends ContentProvider {

    // Database helper object
    private PetDBHelper mDBHelper;

    /** Tag for the log messages */
    public static final String LOG_TAG = PetProvider.class.getSimpleName();

    @Override
    public boolean onCreate() {
        mDBHelper = new PetDBHelper(getContext());
        return true;
    }

    /**
     * query method requests information that is currently in a database
     * Uri specifies the resource that we are interested in
     * Returns Cursor object, containing the rows of interest that we requested
     */
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
                        String sortOrder) {
        SQLiteDatabase db = mDBHelper.getReadableDatabase();
        Cursor cursor = db.query(PetContract.PetEntry.TABLE_NAME, projection, selection,
                selectionArgs, null, null, sortOrder);

        return cursor;
    }

    /**
     * Returns the MIME type of data for the content URI.
     */
    @Override
    public String getType(Uri uri) {
        return null;
    }

    /**
     * Insert new data into the provider with the given ContentValues.
     * Uri tells database where we want this information in
     * ContentValues are the actual values that we want to insert into a database
     * Returns content Uri, telling us exactly where the data was entered in our database
     */
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /**
     * Delete the data at the given selection and selection arguments.
     * Content values are optional
     * Returns an 'int' - the number of raws that were deleted
     */
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    /**
     * Updates the data at the given selection and selection arguments, with the new ContentValues.
     * Uri tells database where we want this information in
     * ContentValues are the actual values that we want to insert into a database
     *
     * Returns an 'int' - the number of rows that were inserted into database
     */
    @Override
    public int update(Uri uri, ContentValues contentValues, String selection,
                      String[] selectionArgs) {
        return 0;
    }
}
