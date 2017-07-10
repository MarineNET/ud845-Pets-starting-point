package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Viktor Khon on 7/9/2017.
 */

public final class PetContract {

    /* Inner class that defines the table contents */
    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;

        // name of a pet
        public static final String COLUMN_PET_NAME = "name";

        // breed of a pet
        public static final String COLUMN_PET_BREED = "breed";

        // gender of a pet, stored as an Integer value
        public static final String COLUMN_PET_GENDER = "gender";

        // weight of a pet
        public static final String COLUMN_PET_WEIGHT = "weight";

        // Possible values for gender
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
