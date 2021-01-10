/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.database.DataSetObserver
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.Filter
 *  android.widget.Filterable
 *  e.f.a.a$a
 *  e.f.a.a$b
 *  e.f.a.b
 *  e.f.a.b$a
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.f.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import e.f.a.a;
import e.f.a.b;

/*
 * Exception performing whole class analysis.
 */
public abstract class a
extends BaseAdapter
implements Filterable,
b.a {
    protected boolean b;
    protected boolean c;
    protected Cursor d;
    protected Context e;
    protected int f;
    protected a g;
    protected DataSetObserver h;
    protected e.f.a.b i;

    public a(Context context, Cursor cursor, boolean bl) {
        int n2 = bl ? 1 : 2;
        this.a(context, cursor, n2);
    }

    public Cursor a() {
        return this.d;
    }

    public abstract View a(Context var1, Cursor var2, ViewGroup var3);

    void a(Context context, Cursor cursor, int n2) {
        b b2;
        if ((n2 & 1) == 1) {
            n2 |= 2;
            this.c = true;
        } else {
            this.c = false;
        }
        boolean bl = false;
        if (cursor != null) {
            bl = true;
        }
        this.d = cursor;
        this.b = bl;
        this.e = context;
        int n3 = bl ? cursor.getColumnIndexOrThrow("_id") : -1;
        this.f = n3;
        if ((n2 & 2) == 2) {
            this.g = new /* Unavailable Anonymous Inner Class!! */;
            b2 = new /* Unavailable Anonymous Inner Class!! */;
        } else {
            b2 = null;
            this.g = null;
        }
        this.h = b2;
        if (bl) {
            DataSetObserver dataSetObserver;
            a a2 = this.g;
            if (a2 != null) {
                cursor.registerContentObserver((ContentObserver)a2);
            }
            if ((dataSetObserver = this.h) != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public void a(Cursor cursor) {
        Cursor cursor2 = this.c(cursor);
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract void a(View var1, Context var2, Cursor var3);

    public abstract View b(Context var1, Cursor var2, ViewGroup var3);

    public abstract CharSequence b(Cursor var1);

    protected void b() {
        Cursor cursor;
        if (this.c && (cursor = this.d) != null && !cursor.isClosed()) {
            this.b = this.d.requery();
        }
    }

    public Cursor c(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            DataSetObserver dataSetObserver;
            a a2 = this.g;
            if (a2 != null) {
                cursor2.unregisterContentObserver((ContentObserver)a2);
            }
            if ((dataSetObserver = this.h) != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = cursor;
        if (cursor != null) {
            DataSetObserver dataSetObserver;
            a a3 = this.g;
            if (a3 != null) {
                cursor.registerContentObserver((ContentObserver)a3);
            }
            if ((dataSetObserver = this.h) != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
            this.f = cursor.getColumnIndexOrThrow("_id");
            this.b = true;
            this.notifyDataSetChanged();
            return cursor2;
        }
        this.f = -1;
        this.b = false;
        this.notifyDataSetInvalidated();
        return cursor2;
    }

    public int getCount() {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public View getDropDownView(int n2, View view, ViewGroup viewGroup) {
        if (this.b) {
            this.d.moveToPosition(n2);
            if (view == null) {
                view = this.a(this.e, this.d, viewGroup);
            }
            this.a(view, this.e, this.d);
            return view;
        }
        return null;
    }

    public Filter getFilter() {
        if (this.i == null) {
            this.i = new e.f.a.b((b.a)this);
        }
        return this.i;
    }

    public Object getItem(int n2) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null) {
            cursor.moveToPosition(n2);
            return this.d;
        }
        return null;
    }

    public long getItemId(int n2) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null && cursor.moveToPosition(n2)) {
            return this.d.getLong(this.f);
        }
        return 0L;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        if (this.b) {
            if (this.d.moveToPosition(n2)) {
                if (view == null) {
                    view = this.b(this.e, this.d, viewGroup);
                }
                this.a(view, this.e, this.d);
                return view;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("couldn't move cursor to position ");
            stringBuilder.append(n2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}

