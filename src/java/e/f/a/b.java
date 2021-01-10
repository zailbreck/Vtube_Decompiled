/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package e.f.a;

import android.database.Cursor;
import android.widget.Filter;

class b
extends Filter {
    a a;

    b(a a2) {
        this.a = a2;
    }

    public CharSequence convertResultToString(Object object) {
        return this.a.b((Cursor)object);
    }

    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor = this.a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursor != null) {
            filterResults.count = cursor.getCount();
        } else {
            filterResults.count = 0;
            cursor = null;
        }
        filterResults.values = cursor;
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursor = this.a.a();
        Object object = filterResults.values;
        if (object != null && object != cursor) {
            this.a.a((Cursor)object);
        }
    }

    static interface a {
        public Cursor a();

        public Cursor a(CharSequence var1);

        public void a(Cursor var1);

        public CharSequence b(Cursor var1);
    }

}

