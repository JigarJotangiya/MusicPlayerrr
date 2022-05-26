package p082e.p122i.p123a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p082e.p122i.p123a.C3797b;

/* renamed from: e.i.a.a */
/* compiled from: CursorAdapter */
public abstract class C3794a extends BaseAdapter implements Filterable, C3797b.C3798a {

    /* renamed from: g */
    protected boolean f11865g;

    /* renamed from: h */
    protected boolean f11866h;

    /* renamed from: i */
    protected Cursor f11867i;

    /* renamed from: j */
    protected Context f11868j;

    /* renamed from: k */
    protected int f11869k;

    /* renamed from: l */
    protected C3795a f11870l;

    /* renamed from: m */
    protected DataSetObserver f11871m;

    /* renamed from: n */
    protected C3797b f11872n;

    /* renamed from: e.i.a.a$a */
    /* compiled from: CursorAdapter */
    private class C3795a extends ContentObserver {
        C3795a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C3794a.this.mo13247r();
        }
    }

    /* renamed from: e.i.a.a$b */
    /* compiled from: CursorAdapter */
    private class C3796b extends DataSetObserver {
        C3796b() {
        }

        public void onChanged() {
            C3794a aVar = C3794a.this;
            aVar.f11865g = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C3794a aVar = C3794a.this;
            aVar.f11865g = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C3794a(Context context, Cursor cursor, boolean z) {
        mo13245o(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo1921a(Cursor cursor) {
        Cursor s = mo13248s(cursor);
        if (s != null) {
            s.close();
        }
    }

    /* renamed from: b */
    public Cursor mo13240b() {
        return this.f11867i;
    }

    /* renamed from: d */
    public abstract CharSequence mo1922d(Cursor cursor);

    public int getCount() {
        Cursor cursor;
        if (!this.f11865g || (cursor = this.f11867i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f11865g) {
            return null;
        }
        this.f11867i.moveToPosition(i);
        if (view == null) {
            view = mo13246p(this.f11868j, this.f11867i, viewGroup);
        }
        mo1927n(view, this.f11868j, this.f11867i);
        return view;
    }

    public Filter getFilter() {
        if (this.f11872n == null) {
            this.f11872n = new C3797b(this);
        }
        return this.f11872n;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f11865g || (cursor = this.f11867i) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f11867i;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f11865g || (cursor = this.f11867i) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f11867i.getLong(this.f11869k);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f11865g) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f11867i.moveToPosition(i)) {
            if (view == null) {
                view = mo1931q(this.f11868j, this.f11867i, viewGroup);
            }
            mo1927n(view, this.f11868j, this.f11867i);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: n */
    public abstract void mo1927n(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13245o(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f11866h = true;
        } else {
            this.f11866h = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f11867i = cursor;
        this.f11865g = z;
        this.f11868j = context;
        this.f11869k = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f11870l = new C3795a();
            this.f11871m = new C3796b();
        } else {
            this.f11870l = null;
            this.f11871m = null;
        }
        if (z) {
            C3795a aVar = this.f11870l;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f11871m;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: p */
    public abstract View mo13246p(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: q */
    public abstract View mo1931q(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo13247r() {
        Cursor cursor;
        if (this.f11866h && (cursor = this.f11867i) != null && !cursor.isClosed()) {
            this.f11865g = this.f11867i.requery();
        }
    }

    /* renamed from: s */
    public Cursor mo13248s(Cursor cursor) {
        Cursor cursor2 = this.f11867i;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C3795a aVar = this.f11870l;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f11871m;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f11867i = cursor;
        if (cursor != null) {
            C3795a aVar2 = this.f11870l;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f11871m;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f11869k = cursor.getColumnIndexOrThrow("_id");
            this.f11865g = true;
            notifyDataSetChanged();
        } else {
            this.f11869k = -1;
            this.f11865g = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
