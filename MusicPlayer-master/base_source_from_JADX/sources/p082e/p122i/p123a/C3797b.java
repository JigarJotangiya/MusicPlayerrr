package p082e.p122i.p123a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: e.i.a.b */
/* compiled from: CursorFilter */
class C3797b extends Filter {

    /* renamed from: a */
    C3798a f11875a;

    /* renamed from: e.i.a.b$a */
    /* compiled from: CursorFilter */
    interface C3798a {
        /* renamed from: a */
        void mo1921a(Cursor cursor);

        /* renamed from: b */
        Cursor mo13240b();

        /* renamed from: d */
        CharSequence mo1922d(Cursor cursor);

        /* renamed from: f */
        Cursor mo1923f(CharSequence charSequence);
    }

    C3797b(C3798a aVar) {
        this.f11875a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f11875a.mo1922d((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor f = this.f11875a.mo1923f(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (f != null) {
            filterResults.count = f.getCount();
            filterResults.values = f;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.f11875a.mo13240b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f11875a.mo1921a((Cursor) obj);
        }
    }
}
