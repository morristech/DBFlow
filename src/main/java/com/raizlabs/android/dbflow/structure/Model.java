package com.raizlabs.android.dbflow.structure;

import android.database.Cursor;

/**
 * Author: andrewgrosner
 * Contributors: { }
 * Description: The main interface for which all DB-based objects should implement.
 */
public interface Model {

    /**
     * Saves the object in the DB.
     * @param async If we want this to happen on the {@link com.raizlabs.android.dbflow.runtime.DBBatchSaveQueue}
     */
    public void save(boolean async);

    /**
     * Deletes the object in the DB
     * @param async If we want this to happen on the {@link com.raizlabs.android.dbflow.runtime.DBTransactionQueue}
     */
    public void delete(boolean async);

    /**
     * Updates an object in the DB
     * @param async If we want this to happen on the {@link com.raizlabs.android.dbflow.runtime.DBTransactionQueue}
     */
    public void update(boolean async);

    /**
     * Loads the {@link com.raizlabs.android.dbflow.structure.Model} from the specified cursor.
     * @param cursor
     */
    public void load(Cursor cursor);

}